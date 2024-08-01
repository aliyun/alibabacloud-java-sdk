// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeCustomLineInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2018-01-23T03:15Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>1516775741000</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <strong>example:</strong>
     * <p>260282302749096109</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("CreatorSubType")
    public String creatorSubType;

    /**
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("CreatorType")
    public String creatorType;

    @NameInMap("Ipv4s")
    public java.util.List<String> ipv4s;

    /**
     * <strong>example:</strong>
     * <p>100003</p>
     */
    @NameInMap("LineId")
    public String lineId;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>0B7AD377-7E86-44A8-B9A8-53E8666E72FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2018-01-24T06:35Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
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
