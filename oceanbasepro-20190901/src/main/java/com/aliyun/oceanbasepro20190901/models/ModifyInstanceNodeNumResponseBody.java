// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceNodeNumResponseBody extends TeaModel {
    /**
     * <p>The return result of the request.</p>
     */
    @NameInMap("Data")
    public ModifyInstanceNodeNumResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceNodeNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNodeNumResponseBody self = new ModifyInstanceNodeNumResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNodeNumResponseBody setData(ModifyInstanceNodeNumResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyInstanceNodeNumResponseBodyData getData() {
        return this.data;
    }

    public ModifyInstanceNodeNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyInstanceNodeNumResponseBodyData extends TeaModel {
        /**
         * <p>The result of the dry-run request.</p>
         * <ul>
         * <li>If the DryRun parameter is set to true and the dry run succeeds, the DryRunResult parameter returns true. Otherwise, an error code is returned.</li>
         * <li>If the DryRun parameter is set to false, no dry run is performed and the DryRunResult parameter returns false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DryRunResult")
        public Boolean dryRunResult;

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>2132903*********</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        public static ModifyInstanceNodeNumResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceNodeNumResponseBodyData self = new ModifyInstanceNodeNumResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceNodeNumResponseBodyData setDryRunResult(Boolean dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }
        public Boolean getDryRunResult() {
            return this.dryRunResult;
        }

        public ModifyInstanceNodeNumResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
