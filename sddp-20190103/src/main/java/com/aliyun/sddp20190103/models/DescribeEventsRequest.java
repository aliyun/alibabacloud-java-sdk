// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventsRequest extends TeaModel {
    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the account that handled the anomalous activity.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun-***</p>
     */
    @NameInMap("DealUserId")
    public String dealUserId;

    /**
     * <p>The time when the detection of the anomalous activity ended. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1698700000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The unique ID of the anomalous activity.</p>
     * 
     * <strong>example:</strong>
     * <p>789026</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the data asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6yzvbc2tg90iuxk.l****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The language of the request and response. The default value is <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The service to which the data asset belongs. Valid values include MaxCompute, OSS, ADS, OTS, and <strong>RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The time when the anomalous activity occurred. This is the start time of the detection. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1657900000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The processing status of the anomalous activity.</p>
     * <ul>
     * <li><p>0: Unhandled.</p>
     * </li>
     * <li><p>1: Confirmed.</p>
     * </li>
     * <li><p>2: Dismissed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The name of the child type of the anomalous activity.</p>
     * <blockquote>
     * <p>To query anomalous activities by the child type name, call the <strong>DescribeEventTypes</strong> operation to get the name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Abnormal data download volume</p>
     */
    @NameInMap("SubTypeCode")
    public String subTypeCode;

    /**
     * <p>The destination service for an anomalous data flow event. Valid values include MaxCompute, OSS, ADS, OTS, and <strong>RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("TargetProductCode")
    public String targetProductCode;

    /**
     * <p>The code of the parent type of the anomalous activity.</p>
     * <ul>
     * <li><p>01: Anomalous permission access.</p>
     * </li>
     * <li><p>02: Anomalous data flow.</p>
     * </li>
     * <li><p>03: Anomalous data operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("TypeCode")
    public String typeCode;

    /**
     * <p>The ID of the account that performed the operation that triggered the anomalous activity.</p>
     * 
     * <strong>example:</strong>
     * <p>1978132506596***</p>
     */
    @NameInMap("UserId")
    public Long userId;

    /**
     * <p>The username of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The risk level of the anomalous activity.</p>
     * <ul>
     * <li><p><strong>1</strong>: Low.</p>
     * </li>
     * <li><p><strong>2</strong>: Medium.</p>
     * </li>
     * <li><p><strong>3</strong>: High.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WarnLevel")
    public Integer warnLevel;

    public static DescribeEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsRequest self = new DescribeEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEventsRequest setDealUserId(String dealUserId) {
        this.dealUserId = dealUserId;
        return this;
    }
    public String getDealUserId() {
        return this.dealUserId;
    }

    public DescribeEventsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeEventsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeEventsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeEventsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeEventsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeEventsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeEventsRequest setSubTypeCode(String subTypeCode) {
        this.subTypeCode = subTypeCode;
        return this;
    }
    public String getSubTypeCode() {
        return this.subTypeCode;
    }

    public DescribeEventsRequest setTargetProductCode(String targetProductCode) {
        this.targetProductCode = targetProductCode;
        return this;
    }
    public String getTargetProductCode() {
        return this.targetProductCode;
    }

    public DescribeEventsRequest setTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public String getTypeCode() {
        return this.typeCode;
    }

    public DescribeEventsRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public DescribeEventsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DescribeEventsRequest setWarnLevel(Integer warnLevel) {
        this.warnLevel = warnLevel;
        return this;
    }
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

}
