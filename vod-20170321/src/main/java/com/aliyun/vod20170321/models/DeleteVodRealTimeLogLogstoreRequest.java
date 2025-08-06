// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodRealTimeLogLogstoreRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public String region;

    public static DeleteVodRealTimeLogLogstoreRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodRealTimeLogLogstoreRequest self = new DeleteVodRealTimeLogLogstoreRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVodRealTimeLogLogstoreRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public DeleteVodRealTimeLogLogstoreRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteVodRealTimeLogLogstoreRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DeleteVodRealTimeLogLogstoreRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
