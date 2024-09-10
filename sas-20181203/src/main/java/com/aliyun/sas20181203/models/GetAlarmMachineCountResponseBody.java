// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAlarmMachineCountResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetAlarmMachineCountResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6D3A2E7D-1238-5DD4-B3C3-BF06FCAD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAlarmMachineCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmMachineCountResponseBody self = new GetAlarmMachineCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlarmMachineCountResponseBody setData(GetAlarmMachineCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlarmMachineCountResponseBodyData getData() {
        return this.data;
    }

    public GetAlarmMachineCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlarmMachineCountResponseBodyData extends TeaModel {
        /**
         * <p>The number of servers on which alerts are generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MachineCount")
        public Integer machineCount;

        public static GetAlarmMachineCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmMachineCountResponseBodyData self = new GetAlarmMachineCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlarmMachineCountResponseBodyData setMachineCount(Integer machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Integer getMachineCount() {
            return this.machineCount;
        }

    }

}
