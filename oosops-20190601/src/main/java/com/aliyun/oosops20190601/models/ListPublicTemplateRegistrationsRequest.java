// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListPublicTemplateRegistrationsRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegistrationId")
    public String registrationId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TemplateName")
    public String templateName;

    public static ListPublicTemplateRegistrationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicTemplateRegistrationsRequest self = new ListPublicTemplateRegistrationsRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicTemplateRegistrationsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListPublicTemplateRegistrationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicTemplateRegistrationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPublicTemplateRegistrationsRequest setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
    public String getRegistrationId() {
        return this.registrationId;
    }

    public ListPublicTemplateRegistrationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListPublicTemplateRegistrationsRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
