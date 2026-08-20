// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeCustomLineInfoResponseBody extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-23T03:15Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The creation timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1516775741000</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The creator.</p>
     * 
     * <strong>example:</strong>
     * <p>260282302749096109</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The subtype of the creator. Valid values:</p>
     * <ul>
     * <li><p><code>CUSTOM</code>: Alibaba Cloud account</p>
     * </li>
     * <li><p><code>SUB</code>: RAM user</p>
     * </li>
     * <li><p><code>STS</code>: assumed role</p>
     * </li>
     * <li><p><code>OTHER</code>: other roles</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("CreatorSubType")
    public String creatorSubType;

    /**
     * <p>The creator type. Valid values:</p>
     * <ul>
     * <li><p><code>USER</code>: user</p>
     * </li>
     * <li><p><code>SYSTEM</code>: system</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("CreatorType")
    public String creatorType;

    @NameInMap("Dnscategory")
    public String dnscategory;

    /**
     * <p>A list of IPv4 address segments.</p>
     */
    @NameInMap("Ipv4s")
    public java.util.List<String> ipv4s;

    /**
     * <p>The unique ID of the custom line.</p>
     * 
     * <strong>example:</strong>
     * <p>100003</p>
     */
    @NameInMap("LineId")
    public String lineId;

    /**
     * <p>The custom line name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B7AD377-7E86-44A8-B9A8-53E8666E72FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The last update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-24T06:35Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The last update timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1516775741000</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    public static DescribeCustomLineInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLineInfoResponseBody self = new DescribeCustomLineInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLineInfoResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeCustomLineInfoResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeCustomLineInfoResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public DescribeCustomLineInfoResponseBody setCreatorSubType(String creatorSubType) {
        this.creatorSubType = creatorSubType;
        return this;
    }
    public String getCreatorSubType() {
        return this.creatorSubType;
    }

    public DescribeCustomLineInfoResponseBody setCreatorType(String creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public String getCreatorType() {
        return this.creatorType;
    }

    public DescribeCustomLineInfoResponseBody setDnscategory(String dnscategory) {
        this.dnscategory = dnscategory;
        return this;
    }
    public String getDnscategory() {
        return this.dnscategory;
    }

    public DescribeCustomLineInfoResponseBody setIpv4s(java.util.List<String> ipv4s) {
        this.ipv4s = ipv4s;
        return this;
    }
    public java.util.List<String> getIpv4s() {
        return this.ipv4s;
    }

    public DescribeCustomLineInfoResponseBody setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }
    public String getLineId() {
        return this.lineId;
    }

    public DescribeCustomLineInfoResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCustomLineInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomLineInfoResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeCustomLineInfoResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

}
