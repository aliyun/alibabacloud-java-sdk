// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RemoveRCInstancesFromDeploymentSetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C816A4BF-A6EC-4722-95F9-2055859CCFD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The call results of the operation.</p>
     */
    @NameInMap("Results")
    public java.util.List<RemoveRCInstancesFromDeploymentSetResponseBodyResults> results;

    public static RemoveRCInstancesFromDeploymentSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveRCInstancesFromDeploymentSetResponseBody self = new RemoveRCInstancesFromDeploymentSetResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveRCInstancesFromDeploymentSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveRCInstancesFromDeploymentSetResponseBody setResults(java.util.List<RemoveRCInstancesFromDeploymentSetResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<RemoveRCInstancesFromDeploymentSetResponseBodyResults> getResults() {
        return this.results;
    }

    public static class RemoveRCInstancesFromDeploymentSetResponseBodyResults extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-w9htiydssds</p>
         */
        @NameInMap("RCInstanceId")
        public String RCInstanceId;

        /**
         * <p>The node status. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: Succeeded.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static RemoveRCInstancesFromDeploymentSetResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            RemoveRCInstancesFromDeploymentSetResponseBodyResults self = new RemoveRCInstancesFromDeploymentSetResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public RemoveRCInstancesFromDeploymentSetResponseBodyResults setRCInstanceId(String RCInstanceId) {
            this.RCInstanceId = RCInstanceId;
            return this;
        }
        public String getRCInstanceId() {
            return this.RCInstanceId;
        }

        public RemoveRCInstancesFromDeploymentSetResponseBodyResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
