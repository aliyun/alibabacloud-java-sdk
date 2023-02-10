// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSimilarEventScenariosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
