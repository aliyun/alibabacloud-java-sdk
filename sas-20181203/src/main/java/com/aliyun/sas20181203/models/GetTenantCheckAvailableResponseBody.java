// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetTenantCheckAvailableResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetTenantCheckAvailableResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>69BFFCDE-37D6-5A49-A8BC-BB03AC83****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTenantCheckAvailableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTenantCheckAvailableResponseBody self = new GetTenantCheckAvailableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTenantCheckAvailableResponseBody setData(GetTenantCheckAvailableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTenantCheckAvailableResponseBodyData getData() {
        return this.data;
    }

    public GetTenantCheckAvailableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTenantCheckAvailableResponseBodyData extends TeaModel {
        /**
         * <p>The timestamp when you can submit a quick scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>1725530005357</p>
         */
        @NameInMap("NextScanTime")
        public Long nextScanTime;

        /**
         * <p>The status of the quick scan task. Enumerated values:</p>
         * <ul>
         * <li>0: You can submit a quick scan task.</li>
         * <li>1: The current task is not complete. You cannot submit a quick scan task.</li>
         * <li>2: The free quota for this week is exhausted. You must wait for the next free scan period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetTenantCheckAvailableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTenantCheckAvailableResponseBodyData self = new GetTenantCheckAvailableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTenantCheckAvailableResponseBodyData setNextScanTime(Long nextScanTime) {
            this.nextScanTime = nextScanTime;
            return this;
        }
        public Long getNextScanTime() {
            return this.nextScanTime;
        }

        public GetTenantCheckAvailableResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
