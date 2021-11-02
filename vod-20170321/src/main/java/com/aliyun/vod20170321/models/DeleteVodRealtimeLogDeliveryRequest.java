// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Project")
    public String project;

    @NameInMap("Region")
    public String region;

    public static DeleteVodRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodRealtimeLogDeliveryRequest self = new DeleteVodRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVodRealtimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteVodRealtimeLogDeliveryRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public DeleteVodRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteVodRealtimeLogDeliveryRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DeleteVodRealtimeLogDeliveryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
