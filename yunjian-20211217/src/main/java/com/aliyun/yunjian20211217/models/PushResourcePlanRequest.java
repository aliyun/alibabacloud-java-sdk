// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class PushResourcePlanRequest extends TeaModel {
    @NameInMap("bufferCnt")
    public Long bufferCnt;

    @NameInMap("demandCount")
    public Long demandCount;

    @NameInMap("demandId")
    public String demandId;

    @NameInMap("methodList")
    public java.util.List<PushResourcePlanRequestMethodList> methodList;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("requireCnt")
    public Long requireCnt;

    @NameInMap("subDemandId")
    public String subDemandId;

    public static PushResourcePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        PushResourcePlanRequest self = new PushResourcePlanRequest();
        return TeaModel.build(map, self);
    }

    public PushResourcePlanRequest setBufferCnt(Long bufferCnt) {
        this.bufferCnt = bufferCnt;
        return this;
    }
    public Long getBufferCnt() {
        return this.bufferCnt;
    }

    public PushResourcePlanRequest setDemandCount(Long demandCount) {
        this.demandCount = demandCount;
        return this;
    }
    public Long getDemandCount() {
        return this.demandCount;
    }

    public PushResourcePlanRequest setDemandId(String demandId) {
        this.demandId = demandId;
        return this;
    }
    public String getDemandId() {
        return this.demandId;
    }

    public PushResourcePlanRequest setMethodList(java.util.List<PushResourcePlanRequestMethodList> methodList) {
        this.methodList = methodList;
        return this;
    }
    public java.util.List<PushResourcePlanRequestMethodList> getMethodList() {
        return this.methodList;
    }

    public PushResourcePlanRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushResourcePlanRequest setRequireCnt(Long requireCnt) {
        this.requireCnt = requireCnt;
        return this;
    }
    public Long getRequireCnt() {
        return this.requireCnt;
    }

    public PushResourcePlanRequest setSubDemandId(String subDemandId) {
        this.subDemandId = subDemandId;
        return this;
    }
    public String getSubDemandId() {
        return this.subDemandId;
    }

    public static class PushResourcePlanRequestMethodListDataList extends TeaModel {
        @NameInMap("classZone")
        public String classZone;

        @NameInMap("convertHostType")
        public String convertHostType;

        @NameInMap("logicZone")
        public String logicZone;

        @NameInMap("netArch")
        public String netArch;

        @NameInMap("nic")
        public String nic;

        @NameInMap("product3")
        public String product3;

        @NameInMap("safeZone")
        public String safeZone;

        @NameInMap("scenario")
        public String scenario;

        @NameInMap("supplyAmount")
        public Long supplyAmount;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("supplyDate")
        public String supplyDate;

        @NameInMap("supplyType")
        public Long supplyType;

        @NameInMap("supplyVmAmount")
        public Integer supplyVmAmount;

        public static PushResourcePlanRequestMethodListDataList build(java.util.Map<String, ?> map) throws Exception {
            PushResourcePlanRequestMethodListDataList self = new PushResourcePlanRequestMethodListDataList();
            return TeaModel.build(map, self);
        }

        public PushResourcePlanRequestMethodListDataList setClassZone(String classZone) {
            this.classZone = classZone;
            return this;
        }
        public String getClassZone() {
            return this.classZone;
        }

        public PushResourcePlanRequestMethodListDataList setConvertHostType(String convertHostType) {
            this.convertHostType = convertHostType;
            return this;
        }
        public String getConvertHostType() {
            return this.convertHostType;
        }

        public PushResourcePlanRequestMethodListDataList setLogicZone(String logicZone) {
            this.logicZone = logicZone;
            return this;
        }
        public String getLogicZone() {
            return this.logicZone;
        }

        public PushResourcePlanRequestMethodListDataList setNetArch(String netArch) {
            this.netArch = netArch;
            return this;
        }
        public String getNetArch() {
            return this.netArch;
        }

        public PushResourcePlanRequestMethodListDataList setNic(String nic) {
            this.nic = nic;
            return this;
        }
        public String getNic() {
            return this.nic;
        }

        public PushResourcePlanRequestMethodListDataList setProduct3(String product3) {
            this.product3 = product3;
            return this;
        }
        public String getProduct3() {
            return this.product3;
        }

        public PushResourcePlanRequestMethodListDataList setSafeZone(String safeZone) {
            this.safeZone = safeZone;
            return this;
        }
        public String getSafeZone() {
            return this.safeZone;
        }

        public PushResourcePlanRequestMethodListDataList setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public PushResourcePlanRequestMethodListDataList setSupplyAmount(Long supplyAmount) {
            this.supplyAmount = supplyAmount;
            return this;
        }
        public Long getSupplyAmount() {
            return this.supplyAmount;
        }

        public PushResourcePlanRequestMethodListDataList setSupplyDate(String supplyDate) {
            this.supplyDate = supplyDate;
            return this;
        }
        public String getSupplyDate() {
            return this.supplyDate;
        }

        public PushResourcePlanRequestMethodListDataList setSupplyType(Long supplyType) {
            this.supplyType = supplyType;
            return this;
        }
        public Long getSupplyType() {
            return this.supplyType;
        }

        public PushResourcePlanRequestMethodListDataList setSupplyVmAmount(Integer supplyVmAmount) {
            this.supplyVmAmount = supplyVmAmount;
            return this;
        }
        public Integer getSupplyVmAmount() {
            return this.supplyVmAmount;
        }

    }

    public static class PushResourcePlanRequestMethodList extends TeaModel {
        @NameInMap("azone")
        public String azone;

        @NameInMap("bufferCnt")
        public Long bufferCnt;

        @NameInMap("cluster")
        public String cluster;

        @NameInMap("comment")
        public String comment;

        @NameInMap("convertHostCnt")
        public Long convertHostCnt;

        @NameInMap("convertHostType")
        public String convertHostType;

        @NameInMap("dataList")
        public java.util.List<PushResourcePlanRequestMethodListDataList> dataList;

        @NameInMap("denamdCount")
        public Long denamdCount;

        @NameInMap("gapCnt")
        public Long gapCnt;

        @NameInMap("promiseDate")
        public String promiseDate;

        @NameInMap("region")
        public String region;

        @NameInMap("resourceMethodId")
        public Long resourceMethodId;

        @NameInMap("roomCode")
        public String roomCode;

        public static PushResourcePlanRequestMethodList build(java.util.Map<String, ?> map) throws Exception {
            PushResourcePlanRequestMethodList self = new PushResourcePlanRequestMethodList();
            return TeaModel.build(map, self);
        }

        public PushResourcePlanRequestMethodList setAzone(String azone) {
            this.azone = azone;
            return this;
        }
        public String getAzone() {
            return this.azone;
        }

        public PushResourcePlanRequestMethodList setBufferCnt(Long bufferCnt) {
            this.bufferCnt = bufferCnt;
            return this;
        }
        public Long getBufferCnt() {
            return this.bufferCnt;
        }

        public PushResourcePlanRequestMethodList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public PushResourcePlanRequestMethodList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public PushResourcePlanRequestMethodList setConvertHostCnt(Long convertHostCnt) {
            this.convertHostCnt = convertHostCnt;
            return this;
        }
        public Long getConvertHostCnt() {
            return this.convertHostCnt;
        }

        public PushResourcePlanRequestMethodList setConvertHostType(String convertHostType) {
            this.convertHostType = convertHostType;
            return this;
        }
        public String getConvertHostType() {
            return this.convertHostType;
        }

        public PushResourcePlanRequestMethodList setDataList(java.util.List<PushResourcePlanRequestMethodListDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<PushResourcePlanRequestMethodListDataList> getDataList() {
            return this.dataList;
        }

        public PushResourcePlanRequestMethodList setDenamdCount(Long denamdCount) {
            this.denamdCount = denamdCount;
            return this;
        }
        public Long getDenamdCount() {
            return this.denamdCount;
        }

        public PushResourcePlanRequestMethodList setGapCnt(Long gapCnt) {
            this.gapCnt = gapCnt;
            return this;
        }
        public Long getGapCnt() {
            return this.gapCnt;
        }

        public PushResourcePlanRequestMethodList setPromiseDate(String promiseDate) {
            this.promiseDate = promiseDate;
            return this;
        }
        public String getPromiseDate() {
            return this.promiseDate;
        }

        public PushResourcePlanRequestMethodList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public PushResourcePlanRequestMethodList setResourceMethodId(Long resourceMethodId) {
            this.resourceMethodId = resourceMethodId;
            return this;
        }
        public Long getResourceMethodId() {
            return this.resourceMethodId;
        }

        public PushResourcePlanRequestMethodList setRoomCode(String roomCode) {
            this.roomCode = roomCode;
            return this;
        }
        public String getRoomCode() {
            return this.roomCode;
        }

    }

}
