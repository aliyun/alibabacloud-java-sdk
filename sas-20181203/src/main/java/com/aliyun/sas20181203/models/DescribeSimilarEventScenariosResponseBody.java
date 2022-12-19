// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSimilarEventScenariosResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The scenarios in which you can handle the alerts triggered by the same rule or rules of the same type.
    @NameInMap("Scenarios")
    public java.util.List<DescribeSimilarEventScenariosResponseBodyScenarios> scenarios;

    public static DescribeSimilarEventScenariosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimilarEventScenariosResponseBody self = new DescribeSimilarEventScenariosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSimilarEventScenariosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSimilarEventScenariosResponseBody setScenarios(java.util.List<DescribeSimilarEventScenariosResponseBodyScenarios> scenarios) {
        this.scenarios = scenarios;
        return this;
    }
    public java.util.List<DescribeSimilarEventScenariosResponseBodyScenarios> getScenarios() {
        return this.scenarios;
    }

    public static class DescribeSimilarEventScenariosResponseBodyScenarios extends TeaModel {
        // The code of the scenario. Valid values: Valid values:
        // - **default**: the same alert type
        // - **same_file_content**: the same file content rule
        // - **same_ip**: the same IP address rule
        // - **same_url**: the same URL rule
        @NameInMap("Code")
        public String code;

        public static DescribeSimilarEventScenariosResponseBodyScenarios build(java.util.Map<String, ?> map) throws Exception {
            DescribeSimilarEventScenariosResponseBodyScenarios self = new DescribeSimilarEventScenariosResponseBodyScenarios();
            return TeaModel.build(map, self);
        }

        public DescribeSimilarEventScenariosResponseBodyScenarios setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

}
