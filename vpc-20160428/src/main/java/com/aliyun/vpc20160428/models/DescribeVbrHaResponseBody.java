// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVbrHaResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("PeerVbrId")
    public String peerVbrId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("VbrHaId")
    public String vbrHaId;

    @NameInMap("VbrId")
    public String vbrId;

    public static DescribeVbrHaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVbrHaResponseBody self = new DescribeVbrHaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVbrHaResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeVbrHaResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVbrHaResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVbrHaResponseBody setPeerVbrId(String peerVbrId) {
        this.peerVbrId = peerVbrId;
        return this;
    }
    public String getPeerVbrId() {
        return this.peerVbrId;
    }

    public DescribeVbrHaResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVbrHaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVbrHaResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVbrHaResponseBody setVbrHaId(String vbrHaId) {
        this.vbrHaId = vbrHaId;
        return this;
    }
    public String getVbrHaId() {
        return this.vbrHaId;
    }

    public DescribeVbrHaResponseBody setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

}
