// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVbrHaResponseBody extends TeaModel {
    /**
     * <p>The time when the VBR was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-08T12:20:55</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the VBR failover group.</p>
     * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the VBR failover group.</p>
     * 
     * <strong>example:</strong>
     * <p>VBRHa</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The instance ID of the other VBR in the VBR failover group.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp12mw1f8k3jgygk9****</p>
     */
    @NameInMap("PeerVbrId")
    public String peerVbrId;

    /**
     * <p>The region ID of the VBR.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the VBR failover group. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: being created.</p>
     * </li>
     * <li><p><strong>Active</strong>: Normal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The VBR failover group instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vbrha-sa1sxheuxtd98****</p>
     */
    @NameInMap("VbrHaId")
    public String vbrHaId;

    /**
     * <p>The VBR instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp1jcg5cmxjbl9xgc****</p>
     */
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
