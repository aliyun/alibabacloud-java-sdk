// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSimilarEventScenariosResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request and can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>FDF7B8D9-8493-4B90-8D13-E0C1FFCE5F97</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of handling scenarios for alerts of the same type.</p>
     */
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
        /**
         * <p>The code of the handling scenario. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: same alerting type</li>
         * <li><strong>same_file_content</strong>: same file content rule</li>
         * <li><strong>same_ip</strong>: same IP rule</li>
         * <li><strong>same_url</strong>: same URL rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>same_url</p>
         */
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
