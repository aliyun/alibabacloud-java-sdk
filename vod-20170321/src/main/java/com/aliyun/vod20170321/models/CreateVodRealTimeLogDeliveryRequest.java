// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateVodRealTimeLogDeliveryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Project")
    public String project;

    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("Region")
    public String region;

    @NameInMap("DomainName")
    public String domainName;

    public static CreateVodRealTimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVodRealTimeLogDeliveryRequest self = new CreateVodRealTimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public CreateVodRealTimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVodRealTimeLogDeliveryRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateVodRealTimeLogDeliveryRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public CreateVodRealTimeLogDeliveryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateVodRealTimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
