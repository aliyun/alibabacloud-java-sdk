// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class GetUrgentDemandItemListResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public GetUrgentDemandItemListResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static GetUrgentDemandItemListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUrgentDemandItemListResponseBody self = new GetUrgentDemandItemListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUrgentDemandItemListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetUrgentDemandItemListResponseBody setData(GetUrgentDemandItemListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUrgentDemandItemListResponseBodyData getData() {
        return this.data;
    }

    public GetUrgentDemandItemListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUrgentDemandItemListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUrgentDemandItemListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("commodityNum")
        public Long commodityNum;

        /**
         * <strong>example:</strong>
         * <p>yundisk</p>
         */
        @NameInMap("commodityTypeCode")
        public String commodityTypeCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dataDiskSize")
        public Long dataDiskSize;

        /**
         * <strong>example:</strong>
         * <p>111222</p>
         */
        @NameInMap("itemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("performanceLevel")
        public Long performanceLevel;

        public static GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest build(java.util.Map<String, ?> map) throws Exception {
            GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest self = new GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest();
            return TeaModel.build(map, self);
        }

        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest setCommodityNum(Long commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Long getCommodityNum() {
            return this.commodityNum;
        }

        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest setCommodityTypeCode(String commodityTypeCode) {
            this.commodityTypeCode = commodityTypeCode;
            return this;
        }
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest setDataDiskSize(Long dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest setPerformanceLevel(Long performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public Long getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

    public static class GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest extends TeaModel {
        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("commodityNum")
        public Long commodityNum;

        @NameInMap("commodityTypeCode")
        public String commodityTypeCode;

        @NameInMap("itemId")
        public Long itemId;

        @NameInMap("vcpuCount")
        public Long vcpuCount;

        public static GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest build(java.util.Map<String, ?> map) throws Exception {
            GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest self = new GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest();
            return TeaModel.build(map, self);
        }

        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest setCommodityNum(Long commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Long getCommodityNum() {
            return this.commodityNum;
        }

        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest setCommodityTypeCode(String commodityTypeCode) {
            this.commodityTypeCode = commodityTypeCode;
            return this;
        }
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest setVcpuCount(Long vcpuCount) {
            this.vcpuCount = vcpuCount;
            return this;
        }
        public Long getVcpuCount() {
            return this.vcpuCount;
        }

    }

    public static class GetUrgentDemandItemListResponseBodyDataRecords extends TeaModel {
        @NameInMap("Zone")
        public String zone;

        @NameInMap("accountId")
        public String accountId;

        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("commodityNum")
        public Long commodityNum;

        @NameInMap("commodityTypeCode")
        public String commodityTypeCode;

        @NameInMap("creator")
        public String creator;

        @NameInMap("creatorName")
        public String creatorName;

        @NameInMap("effectTime")
        public String effectTime;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("modifier")
        public String modifier;

        @NameInMap("modifierName")
        public String modifierName;

        @NameInMap("networkType")
        public String networkType;

        @NameInMap("payDuration")
        public Long payDuration;

        @NameInMap("payDurationUnit")
        public String payDurationUnit;

        @NameInMap("payType")
        public String payType;

        @NameInMap("planId")
        public Long planId;

        @NameInMap("region")
        public String region;

        @NameInMap("urgentDemandEbsRequest")
        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest urgentDemandEbsRequest;

        @NameInMap("urgentDemandEcsRequest")
        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest urgentDemandEcsRequest;

        public static GetUrgentDemandItemListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetUrgentDemandItemListResponseBodyDataRecords self = new GetUrgentDemandItemListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setCommodityNum(Long commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Long getCommodityNum() {
            return this.commodityNum;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setCommodityTypeCode(String commodityTypeCode) {
            this.commodityTypeCode = commodityTypeCode;
            return this;
        }
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setEffectTime(String effectTime) {
            this.effectTime = effectTime;
            return this;
        }
        public String getEffectTime() {
            return this.effectTime;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setPayDuration(Long payDuration) {
            this.payDuration = payDuration;
            return this;
        }
        public Long getPayDuration() {
            return this.payDuration;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setPayDurationUnit(String payDurationUnit) {
            this.payDurationUnit = payDurationUnit;
            return this;
        }
        public String getPayDurationUnit() {
            return this.payDurationUnit;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setUrgentDemandEbsRequest(GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest urgentDemandEbsRequest) {
            this.urgentDemandEbsRequest = urgentDemandEbsRequest;
            return this;
        }
        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEbsRequest getUrgentDemandEbsRequest() {
            return this.urgentDemandEbsRequest;
        }

        public GetUrgentDemandItemListResponseBodyDataRecords setUrgentDemandEcsRequest(GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest urgentDemandEcsRequest) {
            this.urgentDemandEcsRequest = urgentDemandEcsRequest;
            return this;
        }
        public GetUrgentDemandItemListResponseBodyDataRecordsUrgentDemandEcsRequest getUrgentDemandEcsRequest() {
            return this.urgentDemandEcsRequest;
        }

    }

    public static class GetUrgentDemandItemListResponseBodyData extends TeaModel {
        @NameInMap("current")
        public Long current;

        @NameInMap("pages")
        public Long pages;

        @NameInMap("records")
        public java.util.List<GetUrgentDemandItemListResponseBodyDataRecords> records;

        @NameInMap("size")
        public Long size;

        @NameInMap("total")
        public Long total;

        public static GetUrgentDemandItemListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUrgentDemandItemListResponseBodyData self = new GetUrgentDemandItemListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUrgentDemandItemListResponseBodyData setCurrent(Long current) {
            this.current = current;
            return this;
        }
        public Long getCurrent() {
            return this.current;
        }

        public GetUrgentDemandItemListResponseBodyData setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public GetUrgentDemandItemListResponseBodyData setRecords(java.util.List<GetUrgentDemandItemListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetUrgentDemandItemListResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetUrgentDemandItemListResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetUrgentDemandItemListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
