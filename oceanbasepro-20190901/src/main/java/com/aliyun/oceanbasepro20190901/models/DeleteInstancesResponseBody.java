// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteInstancesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DeleteInstancesResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-<strong><strong>-</strong></strong>-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancesResponseBody self = new DeleteInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstancesResponseBody setData(DeleteInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteInstancesResponseBodyData getData() {
        return this.data;
    }

    public DeleteInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteInstancesResponseBodyData extends TeaModel {
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

        public static DeleteInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteInstancesResponseBodyData self = new DeleteInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteInstancesResponseBodyData setDryRunResult(Boolean dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }
        public Boolean getDryRunResult() {
            return this.dryRunResult;
        }

    }

}
