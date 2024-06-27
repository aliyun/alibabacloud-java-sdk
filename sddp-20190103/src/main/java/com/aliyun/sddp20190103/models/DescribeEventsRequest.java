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
     * <p>The ID of the account that handles the anomalous event.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun-***</p>
     */
    @NameInMap("DealUserId")
    public String dealUserId;

    /**
     * <p>The end of the time range during which the anomalous events are detected. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1698700000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The unique ID of the anomalous event.</p>
     * 
     * <strong>example:</strong>
     * <p>789026</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the data asset.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6yzvbc2tg90iuxk.l****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese</li>
     * <li><strong>en_us</strong>: English</li>
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
     * <p>The name of the service to which the table belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The beginning of the time range during which the anomalous events are detected. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1657900000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The handling status of the anomalous event. Valid values:</p>
     * <ul>
     * <li>0: unhandled</li>
     * <li>1: confirmed</li>
     * <li>2: marked as false positive</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The name of the anomalous event subtype.</p>
     * <blockquote>
     * <p>You can call the <strong>DescribeEventTypes</strong> operation to query the name of the anomalous event subtype.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Anomalous volume of downloaded data</p>
     */
    @NameInMap("SubTypeCode")
    public String subTypeCode;

    /**
     * <p>The name of the destination service in an anomalous data flow. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong></p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("TargetProductCode")
    public String targetProductCode;

    /**
     * <p>The name of the anomalous event type. Valid values:</p>
     * <ul>
     * <li>01: anomalous permission usage</li>
     * <li>02: anomalous data flow</li>
     * <li>03: anomalous data operation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("TypeCode")
    public String typeCode;

    /**
     * <p>The ID of the account that triggered the anomalous event.</p>
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
     * <p>The risk level of the alert that is triggered. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: low</li>
     * <li><strong>2</strong>: medium</li>
     * <li><strong>3</strong>: high</li>
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

    public DescribeEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
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

    public DescribeEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
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
