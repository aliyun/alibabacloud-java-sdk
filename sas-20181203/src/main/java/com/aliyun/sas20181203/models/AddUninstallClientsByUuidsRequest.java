// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddUninstallClientsByUuidsRequest extends TeaModel {
    /**
     * <p>The method name. Default value: init.</p>
     */
    @NameInMap("CallMethod")
    public String callMethod;

    /**
     * <p>The feedback.</p>
     */
    @NameInMap("Feedback")
    public String feedback;

    /**
     * <p>The region in which the server resides.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the server that you want to unbind. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~141932~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static AddUninstallClientsByUuidsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUninstallClientsByUuidsRequest self = new AddUninstallClientsByUuidsRequest();
        return TeaModel.build(map, self);
    }

    public AddUninstallClientsByUuidsRequest setCallMethod(String callMethod) {
        this.callMethod = callMethod;
        return this;
    }
    public String getCallMethod() {
        return this.callMethod;
    }

    public AddUninstallClientsByUuidsRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public AddUninstallClientsByUuidsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddUninstallClientsByUuidsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddUninstallClientsByUuidsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
