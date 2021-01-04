// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateCloudConnectNetworkResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CcnId")
    public String ccnId;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("SnatCidrBlock")
    public String snatCidrBlock;

    @NameInMap("Name")
    public String name;

    public static CreateCloudConnectNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudConnectNetworkResponseBody self = new CreateCloudConnectNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudConnectNetworkResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateCloudConnectNetworkResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCloudConnectNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudConnectNetworkResponseBody setCcnId(String ccnId) {
        this.ccnId = ccnId;
        return this;
    }
    public String getCcnId() {
        return this.ccnId;
    }

    public CreateCloudConnectNetworkResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateCloudConnectNetworkResponseBody setSnatCidrBlock(String snatCidrBlock) {
        this.snatCidrBlock = snatCidrBlock;
        return this;
    }
    public String getSnatCidrBlock() {
        return this.snatCidrBlock;
    }

    public CreateCloudConnectNetworkResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
