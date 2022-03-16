package com.iggroup.webapi.samples.client.rest;

import com.iggroup.webapi.samples.client.rest.dto.session.encryptionKey.getEncryptionKeySessionV1.GetEncryptionKeySessionV1Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EncryptionService extends AbstractService {
    public GetEncryptionKeySessionV1Response getEncryptionKeySessionV1(ConversationContext conversationContext) throws Exception {
        String uri = "/session/encryptionKey";
        HttpEntity<?> requestEntity = buildHttpEntity(conversationContext, null, "1");
        ResponseEntity<GetEncryptionKeySessionV1Response> response = restTemplate.exchange(getIGApiDomainURL() + addIGApiLightDarkCluster(uri), HttpMethod.GET, requestEntity, GetEncryptionKeySessionV1Response.class);
        return response.getBody();
    }
}
