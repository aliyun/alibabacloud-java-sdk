// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetUnknownThreatDetectStatisticResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetUnknownThreatDetectStatisticResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FD394AF6-591E-5168-8C8C-4C7847******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUnknownThreatDetectStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUnknownThreatDetectStatisticResponseBody self = new GetUnknownThreatDetectStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUnknownThreatDetectStatisticResponseBody setData(GetUnknownThreatDetectStatisticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUnknownThreatDetectStatisticResponseBodyData getData() {
        return this.data;
    }

    public GetUnknownThreatDetectStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUnknownThreatDetectStatisticResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BlockMachineCount")
        public Integer blockMachineCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MachineCount")
        public Integer machineCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MonitorMachineCount")
        public Integer monitorMachineCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OpenMachineCount")
        public Integer openMachineCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StudyingMachineCount")
        public Integer studyingMachineCount;

        public static GetUnknownThreatDetectStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUnknownThreatDetectStatisticResponseBodyData self = new GetUnknownThreatDetectStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUnknownThreatDetectStatisticResponseBodyData setBlockMachineCount(Integer blockMachineCount) {
            this.blockMachineCount = blockMachineCount;
            return this;
        }
        public Integer getBlockMachineCount() {
            return this.blockMachineCount;
        }

        public GetUnknownThreatDetectStatisticResponseBodyData setMachineCount(Integer machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Integer getMachineCount() {
            return this.machineCount;
        }

        public GetUnknownThreatDetectStatisticResponseBodyData setMonitorMachineCount(Integer monitorMachineCount) {
            this.monitorMachineCount = monitorMachineCount;
            return this;
        }
        public Integer getMonitorMachineCount() {
            return this.monitorMachineCount;
        }

        public GetUnknownThreatDetectStatisticResponseBodyData setOpenMachineCount(Integer openMachineCount) {
            this.openMachineCount = openMachineCount;
            return this;
        }
        public Integer getOpenMachineCount() {
            return this.openMachineCount;
        }

        public GetUnknownThreatDetectStatisticResponseBodyData setStudyingMachineCount(Integer studyingMachineCount) {
            this.studyingMachineCount = studyingMachineCount;
            return this;
        }
        public Integer getStudyingMachineCount() {
            return this.studyingMachineCount;
        }

    }

}
