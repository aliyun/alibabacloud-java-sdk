// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventsRequest extends TeaModel {
    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the account that handles the anomalous event.</p>
     */
    @NameInMap("DealUserId")
    public String dealUserId;

    /**
     * <p>The end of the time range during which the anomalous events are detected. The value is a UNIX timestamp. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The unique ID of the anomalous event.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the data asset.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the service to which the table belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The beginning of the time range during which the anomalous events are detected. The value is a UNIX timestamp. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The handling status of the anomalous event. Valid values:</p>
     * <br>
     * <p>*   0: unhandled</p>
     * <p>*   1: confirmed</p>
     * <p>*   2: marked as false positive</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The name of the anomalous event subtype.</p>
     * <br>
     * <p>> You can call the **DescribeEventTypes** operation to query the name of the anomalous event subtype.</p>
     */
    @NameInMap("SubTypeCode")
    public String subTypeCode;

    /**
     * <p>The name of the destination service in an anomalous data flow. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**</p>
     */
    @NameInMap("TargetProductCode")
    public String targetProductCode;

    /**
     * <p>The name of the anomalous event type. Valid values:</p>
     * <br>
     * <p>*   01: anomalous permission usage</p>
     * <p>*   02: anomalous data flow</p>
     * <p>*   03: anomalous data operation</p>
     */
    @NameInMap("TypeCode")
    public String typeCode;

    /**
     * <p>The ID of the account that triggered the anomalous event.</p>
     */
    @NameInMap("UserId")
    public Long userId;

    /**
     * <p>The username of the RAM user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The risk level of the alert that is triggered. Valid values:</p>
     * <br>
     * <p>*   **1**: low</p>
     * <p>*   **2**: medium</p>
     * <p>*   **3**: high</p>
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
