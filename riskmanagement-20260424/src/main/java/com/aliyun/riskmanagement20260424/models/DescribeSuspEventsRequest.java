// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-guangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
         * <strong>example:</strong>
         * <p>6838133766c37077d0515b0b557e6510</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        @NameInMap("AssetsTypeList")
        public java.util.List<String> assetsTypeList;

        /**
         * <strong>example:</strong>
         * <p>xxljob-02f023138826b</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("ContainerFieldName")
        public String containerFieldName;

        /**
         * <strong>example:</strong>
         * <p>ca9b91db58356b41af2932e8048310ab7daa415701fa62d823cf4f0406d5ce02</p>
         */
        @NameInMap("ContainerFieldValue")
        public String containerFieldValue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public String currentPage;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Dealed")
        public String dealed;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DetectSource")
        public String detectSource;

        /**
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        @NameInMap("EventNames")
        public String eventNames;

        /**
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <strong>example:</strong>
         * <p>18768</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <strong>example:</strong>
         * <p>3165</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <strong>example:</strong>
         * <p>serious</p>
         */
        @NameInMap("Levels")
        public String levels;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MultiAccountActionType")
        public Integer multiAccountActionType;

        /**
         * <strong>example:</strong>
         * <p>ecs-xxx</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("OperateErrorCodeList")
        public java.util.List<String> operateErrorCodeList;

        /**
         * <strong>example:</strong>
         * <p>2022-07-06 13:50:38</p>
         */
        @NameInMap("OperateTimeEnd")
        public String operateTimeEnd;

        /**
         * <strong>example:</strong>
         * <p>2022-07-06 13:50:38</p>
         */
        @NameInMap("OperateTimeStart")
        public String operateTimeStart;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>恶意脚本</p>
         */
        @NameInMap("ParentEventTypes")
        public String parentEventTypes;

        /**
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>5815612291408486</p>
         */
        @NameInMap("ResourceDirectoryAccountId")
        public Long resourceDirectoryAccountId;

        /**
         * <strong>example:</strong>
         * <p>lastTime</p>
         */
        @NameInMap("SortColumn")
        public String sortColumn;

        /**
         * <strong>example:</strong>
         * <p>asc</p>
         */
        @NameInMap("SortType")
        public String sortType;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Source")
        public String source;

        @NameInMap("SourceAliUids")
        public java.util.List<Long> sourceAliUids;

        /**
         * <strong>example:</strong>
         * <p>2409:8a55:3827:cb50:5ad9:d5ff:fe87:f48c</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        /**
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("StrictMode")
        public String strictMode;

        @NameInMap("SupportOperateCodeList")
        public java.util.List<String> supportOperateCodeList;

        /**
         * <strong>example:</strong>
         * <p>TA0003</p>
         */
        @NameInMap("TacticId")
        public String tacticId;

        /**
         * <strong>example:</strong>
         * <p>containerId</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <strong>example:</strong>
         * <p>2022-07-06 13:50:38</p>
         */
        @NameInMap("TimeEnd")
        public String timeEnd;

        /**
         * <strong>example:</strong>
         * <p>2022-07-06 13:50:38</p>
         */
        @NameInMap("TimeStart")
        public String timeStart;

        /**
         * <strong>example:</strong>
         * <p>f82680d9fdcb74a520fa385b7e9105b7</p>
         */
        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        /**
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
