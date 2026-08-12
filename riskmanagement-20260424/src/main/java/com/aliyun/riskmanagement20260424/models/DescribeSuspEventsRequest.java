// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request parameters.</p>
     */
    @NameInMap("SdkRequest")
    public DescribeSuspEventsRequestSdkRequest sdkRequest;

    public static DescribeSuspEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsRequest self = new DescribeSuspEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSuspEventsRequest setSdkRequest(DescribeSuspEventsRequestSdkRequest sdkRequest) {
        this.sdkRequest = sdkRequest;
        return this;
    }
    public DescribeSuspEventsRequestSdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static class DescribeSuspEventsRequestSdkRequest extends TeaModel {
        /**
         * <p>The unique ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>6838133766c37077d0515b0b557e6510</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        /**
         * <p>The list of asset types.</p>
         */
        @NameInMap("AssetsTypeList")
        public java.util.List<String> assetsTypeList;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-02f023138826b</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The container search field. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("ContainerFieldName")
        public String containerFieldName;

        /**
         * <p>The value of the container search field.</p>
         * 
         * <strong>example:</strong>
         * <p>ca9b91db58356b41af2932e8048310ab7daa415701fa62d823cf4f0406d5ce02</p>
         */
        @NameInMap("ContainerFieldValue")
        public String containerFieldValue;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public String currentPage;

        /**
         * <p>The status of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Dealed")
        public String dealed;

        /**
         * <p>The detection source. This is an invalid field.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DetectSource")
        public String detectSource;

        /**
         * <p>The subtypes of the alert event. Separate multiple subtypes with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        @NameInMap("EventNames")
        public String eventNames;

        /**
         * <p>The request source identifier. Set the value to <strong>sas</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <p>The tag group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18768</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The unique ID that identifies the alert event record.</p>
         * 
         * <strong>example:</strong>
         * <p>3165</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The language type of the response. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The severity levels of the alert event. Separate multiple levels with commas (in descending order of severity).</p>
         * 
         * <strong>example:</strong>
         * <p>serious</p>
         */
        @NameInMap("Levels")
        public String levels;

        /**
         * <p>The multi-account query type. Default value: <strong>0</strong>. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MultiAccountActionType")
        public Integer multiAccountActionType;

        /**
         * <p>The name of the asset affected by the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-xxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of alert event handling result codes.</p>
         */
        @NameInMap("OperateErrorCodeList")
        public java.util.List<String> operateErrorCodeList;

        /**
         * <p>The end timestamp of the handling time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-06 13:50:38</p>
         */
        @NameInMap("OperateTimeEnd")
        public String operateTimeEnd;

        /**
         * <p>The start timestamp of the handling time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-06 13:50:38</p>
         */
        @NameInMap("OperateTimeStart")
        public String operateTimeStart;

        /**
         * <p>The maximum number of entries per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The Alarm Metric of the alerting events to query. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Malicious Scripts.</p>
         */
        @NameInMap("ParentEventTypes")
        public String parentEventTypes;

        /**
         * <p>The alert name or asset information to query.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
         * 
         * <strong>example:</strong>
         * <p>5815612291408486</p>
         */
        @NameInMap("ResourceDirectoryAccountId")
        public Long resourceDirectoryAccountId;

        /**
         * <p>The custom sort field. Default value: <strong>operateTime</strong>. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>lastTime</p>
         */
        @NameInMap("SortColumn")
        public String sortColumn;

        /**
         * <p>The sort order based on certificate expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        @NameInMap("SortType")
        public String sortType;

        /**
         * <p>The alert source.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The list of Alibaba Cloud account IDs that generated the alerts.</p>
         */
        @NameInMap("SourceAliUids")
        public java.util.List<Long> sourceAliUids;

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>2409:8a55:3827:cb50:5ad9:d5ff:fe87:f48c</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        /**
         * <p>Indicates whether the alert belongs to strict mode.</p>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("StrictMode")
        public String strictMode;

        /**
         * <p>The list of operation types supported by the alert.</p>
         */
        @NameInMap("SupportOperateCodeList")
        public java.util.List<String> supportOperateCodeList;

        /**
         * <p>The ATT&amp;CK tactic ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TA0003</p>
         */
        @NameInMap("TacticId")
        public String tacticId;

        /**
         * <p>The container search target type. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>containerId</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The end time of the latest occurrence time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-06 13:50:38</p>
         */
        @NameInMap("TimeEnd")
        public String timeEnd;

        /**
         * <p>The start time of the latest occurrence time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-06 13:50:38</p>
         */
        @NameInMap("TimeStart")
        public String timeStart;

        /**
         * <p>The unique key of the security alert.</p>
         * 
         * <strong>example:</strong>
         * <p>f82680d9fdcb74a520fa385b7e9105b7</p>
         */
        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        /**
         * <p>The UUIDs of the servers for which to query alerts. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>inet-eae09bb8-32b1-413b-a8ff-23932e043209</p>
         */
        @NameInMap("Uuids")
        public String uuids;

        public static DescribeSuspEventsRequestSdkRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsRequestSdkRequest self = new DescribeSuspEventsRequestSdkRequest();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsRequestSdkRequest setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeSuspEventsRequestSdkRequest setAssetsTypeList(java.util.List<String> assetsTypeList) {
            this.assetsTypeList = assetsTypeList;
            return this;
        }
        public java.util.List<String> getAssetsTypeList() {
            return this.assetsTypeList;
        }

        public DescribeSuspEventsRequestSdkRequest setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeSuspEventsRequestSdkRequest setContainerFieldName(String containerFieldName) {
            this.containerFieldName = containerFieldName;
            return this;
        }
        public String getContainerFieldName() {
            return this.containerFieldName;
        }

        public DescribeSuspEventsRequestSdkRequest setContainerFieldValue(String containerFieldValue) {
            this.containerFieldValue = containerFieldValue;
            return this;
        }
        public String getContainerFieldValue() {
            return this.containerFieldValue;
        }

        public DescribeSuspEventsRequestSdkRequest setCurrentPage(String currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public String getCurrentPage() {
            return this.currentPage;
        }

        public DescribeSuspEventsRequestSdkRequest setDealed(String dealed) {
            this.dealed = dealed;
            return this;
        }
        public String getDealed() {
            return this.dealed;
        }

        public DescribeSuspEventsRequestSdkRequest setDetectSource(String detectSource) {
            this.detectSource = detectSource;
            return this;
        }
        public String getDetectSource() {
            return this.detectSource;
        }

        public DescribeSuspEventsRequestSdkRequest setEventNames(String eventNames) {
            this.eventNames = eventNames;
            return this;
        }
        public String getEventNames() {
            return this.eventNames;
        }

        public DescribeSuspEventsRequestSdkRequest setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public DescribeSuspEventsRequestSdkRequest setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeSuspEventsRequestSdkRequest setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSuspEventsRequestSdkRequest setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeSuspEventsRequestSdkRequest setLevels(String levels) {
            this.levels = levels;
            return this;
        }
        public String getLevels() {
            return this.levels;
        }

        public DescribeSuspEventsRequestSdkRequest setMultiAccountActionType(Integer multiAccountActionType) {
            this.multiAccountActionType = multiAccountActionType;
            return this;
        }
        public Integer getMultiAccountActionType() {
            return this.multiAccountActionType;
        }

        public DescribeSuspEventsRequestSdkRequest setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventsRequestSdkRequest setOperateErrorCodeList(java.util.List<String> operateErrorCodeList) {
            this.operateErrorCodeList = operateErrorCodeList;
            return this;
        }
        public java.util.List<String> getOperateErrorCodeList() {
            return this.operateErrorCodeList;
        }

        public DescribeSuspEventsRequestSdkRequest setOperateTimeEnd(String operateTimeEnd) {
            this.operateTimeEnd = operateTimeEnd;
            return this;
        }
        public String getOperateTimeEnd() {
            return this.operateTimeEnd;
        }

        public DescribeSuspEventsRequestSdkRequest setOperateTimeStart(String operateTimeStart) {
            this.operateTimeStart = operateTimeStart;
            return this;
        }
        public String getOperateTimeStart() {
            return this.operateTimeStart;
        }

        public DescribeSuspEventsRequestSdkRequest setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public DescribeSuspEventsRequestSdkRequest setParentEventTypes(String parentEventTypes) {
            this.parentEventTypes = parentEventTypes;
            return this;
        }
        public String getParentEventTypes() {
            return this.parentEventTypes;
        }

        public DescribeSuspEventsRequestSdkRequest setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeSuspEventsRequestSdkRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }
        public Long getResourceDirectoryAccountId() {
            return this.resourceDirectoryAccountId;
        }

        public DescribeSuspEventsRequestSdkRequest setSortColumn(String sortColumn) {
            this.sortColumn = sortColumn;
            return this;
        }
        public String getSortColumn() {
            return this.sortColumn;
        }

        public DescribeSuspEventsRequestSdkRequest setSortType(String sortType) {
            this.sortType = sortType;
            return this;
        }
        public String getSortType() {
            return this.sortType;
        }

        public DescribeSuspEventsRequestSdkRequest setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeSuspEventsRequestSdkRequest setSourceAliUids(java.util.List<Long> sourceAliUids) {
            this.sourceAliUids = sourceAliUids;
            return this;
        }
        public java.util.List<Long> getSourceAliUids() {
            return this.sourceAliUids;
        }

        public DescribeSuspEventsRequestSdkRequest setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeSuspEventsRequestSdkRequest setStrictMode(String strictMode) {
            this.strictMode = strictMode;
            return this;
        }
        public String getStrictMode() {
            return this.strictMode;
        }

        public DescribeSuspEventsRequestSdkRequest setSupportOperateCodeList(java.util.List<String> supportOperateCodeList) {
            this.supportOperateCodeList = supportOperateCodeList;
            return this;
        }
        public java.util.List<String> getSupportOperateCodeList() {
            return this.supportOperateCodeList;
        }

        public DescribeSuspEventsRequestSdkRequest setTacticId(String tacticId) {
            this.tacticId = tacticId;
            return this;
        }
        public String getTacticId() {
            return this.tacticId;
        }

        public DescribeSuspEventsRequestSdkRequest setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeSuspEventsRequestSdkRequest setTimeEnd(String timeEnd) {
            this.timeEnd = timeEnd;
            return this;
        }
        public String getTimeEnd() {
            return this.timeEnd;
        }

        public DescribeSuspEventsRequestSdkRequest setTimeStart(String timeStart) {
            this.timeStart = timeStart;
            return this;
        }
        public String getTimeStart() {
            return this.timeStart;
        }

        public DescribeSuspEventsRequestSdkRequest setUniqueInfo(String uniqueInfo) {
            this.uniqueInfo = uniqueInfo;
            return this;
        }
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

        public DescribeSuspEventsRequestSdkRequest setUuids(String uuids) {
            this.uuids = uuids;
            return this;
        }
        public String getUuids() {
            return this.uuids;
        }

    }

}
