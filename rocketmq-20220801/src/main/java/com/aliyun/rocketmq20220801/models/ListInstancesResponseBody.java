// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingPageNumber</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public ListInstancesResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>PageNumber</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>pageNumber</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter pageNumber is mandatory for this action .</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>84445A20-2B50-5306-A3C0-AF99FC1833C6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesResponseBody setData(ListInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstancesResponseBodyData getData() {
        return this.data;
    }

    public ListInstancesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListInstancesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstancesResponseBodyDataListProductInfo extends TeaModel {
        /**
         * <p>Indicates whether the message trace feature is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is not in use. By default, the message trace feature is enabled for ApsaraMQ for RocketMQ instances, regardless of whether this parameter is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("traceOn")
        public Boolean traceOn;

        public static ListInstancesResponseBodyDataListProductInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataListProductInfo self = new ListInstancesResponseBodyDataListProductInfo();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataListProductInfo setTraceOn(Boolean traceOn) {
            this.traceOn = traceOn;
            return this;
        }
        public Boolean getTraceOn() {
            return this.traceOn;
        }

    }

    public static class ListInstancesResponseBodyDataListTags extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("value")
        public String value;

        public static ListInstancesResponseBodyDataListTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataListTags self = new ListInstancesResponseBodyDataListTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyDataListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyDataList extends TeaModel {
        /**
         * <p>The commodity code of the instance. The commodity code of ApsaraMQ for RocketMQ 5.0 instances has a similar format to ons_rmqsub_public_cn.</p>
         * 
         * <strong>example:</strong>
         * <p>ons_rmqsub_public_cn</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The time when the version of the instance was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 00:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-01 00:00:00</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <p>The number of consumer groups that are created on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("groupCount")
        public Long groupCount;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test instance</p>
         */
        @NameInMap("instanceName")
        public String instanceName;

        /**
         * <p>The billing method of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PayAsYouGo</li>
         * <li>Subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The product information.</p>
         */
        @NameInMap("productInfo")
        public ListInstancesResponseBodyDataListProductInfo productInfo;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The time when the instance was released.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-07 00:00:00</p>
         */
        @NameInMap("releaseTime")
        public String releaseTime;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is remark for instance.</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmx7caj******</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The primary edition of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard: Standard Edition</li>
         * <li>ultimate: Enterprise Platinum Edition</li>
         * <li>professional: Professional Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("seriesCode")
        public String seriesCode;

        /**
         * <p>The code of the service to which the instance belongs. The service code of ApsaraMQ for RocketMQ is rmq.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq</p>
         */
        @NameInMap("serviceCode")
        public String serviceCode;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 00:00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The status of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RELEASED</li>
         * <li>RUNNING</li>
         * <li>STOPPED</li>
         * <li>CHANGING</li>
         * <li>CREATING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The sub-category edition of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cluster_ha: Cluster High-availability Edition</li>
         * <li>single_node: Standalone Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster_ha</p>
         */
        @NameInMap("subSeriesCode")
        public String subSeriesCode;

        /**
         * <p>The resource tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListInstancesResponseBodyDataListTags> tags;

        /**
         * <p>The number of topics that are created on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("topicCount")
        public Long topicCount;

        /**
         * <p>The time when the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-02 00:00:00</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The ID of the user who owns the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6W0xz2uPfiwp****</p>
         */
        @NameInMap("userId")
        public String userId;

        public static ListInstancesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataList self = new ListInstancesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListInstancesResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyDataList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListInstancesResponseBodyDataList setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public ListInstancesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyDataList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyDataList setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListInstancesResponseBodyDataList setProductInfo(ListInstancesResponseBodyDataListProductInfo productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public ListInstancesResponseBodyDataListProductInfo getProductInfo() {
            return this.productInfo;
        }

        public ListInstancesResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstancesResponseBodyDataList setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public ListInstancesResponseBodyDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListInstancesResponseBodyDataList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesResponseBodyDataList setSeriesCode(String seriesCode) {
            this.seriesCode = seriesCode;
            return this;
        }
        public String getSeriesCode() {
            return this.seriesCode;
        }

        public ListInstancesResponseBodyDataList setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public ListInstancesResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListInstancesResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyDataList setSubSeriesCode(String subSeriesCode) {
            this.subSeriesCode = subSeriesCode;
            return this;
        }
        public String getSubSeriesCode() {
            return this.subSeriesCode;
        }

        public ListInstancesResponseBodyDataList setTags(java.util.List<ListInstancesResponseBodyDataListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataListTags> getTags() {
            return this.tags;
        }

        public ListInstancesResponseBodyDataList setTopicCount(Long topicCount) {
            this.topicCount = topicCount;
            return this;
        }
        public Long getTopicCount() {
            return this.topicCount;
        }

        public ListInstancesResponseBodyDataList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListInstancesResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("list")
        public java.util.List<ListInstancesResponseBodyDataList> list;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setList(java.util.List<ListInstancesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListInstancesResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListInstancesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListInstancesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
