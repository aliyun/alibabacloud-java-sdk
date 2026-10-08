// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AddRCInstancesToDeploymentSetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>08A3B71B-FE08-4B03-974F-CC7EA6DB1828</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The inspection results.</p>
     */
    @NameInMap("Results")
    public java.util.List<AddRCInstancesToDeploymentSetResponseBodyResults> results;

    public static AddRCInstancesToDeploymentSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRCInstancesToDeploymentSetResponseBody self = new AddRCInstancesToDeploymentSetResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRCInstancesToDeploymentSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRCInstancesToDeploymentSetResponseBody setResults(java.util.List<AddRCInstancesToDeploymentSetResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AddRCInstancesToDeploymentSetResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AddRCInstancesToDeploymentSetResponseBodyResults extends TeaModel {
        /**
         * <p>The node status. Valid values:</p>
         * <ul>
         * <li><strong>activation</strong>: Running.</li>
         * <li><strong>creating</strong>: Being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-aaaa</p>
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

        public static AddRCInstancesToDeploymentSetResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AddRCInstancesToDeploymentSetResponseBodyResults self = new AddRCInstancesToDeploymentSetResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AddRCInstancesToDeploymentSetResponseBodyResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public AddRCInstancesToDeploymentSetResponseBodyResults setRCInstanceId(String RCInstanceId) {
            this.RCInstanceId = RCInstanceId;
            return this;
        }
        public String getRCInstanceId() {
            return this.RCInstanceId;
        }

        public AddRCInstancesToDeploymentSetResponseBodyResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
