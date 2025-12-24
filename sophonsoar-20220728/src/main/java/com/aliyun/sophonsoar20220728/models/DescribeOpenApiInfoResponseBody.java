// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeOpenApiInfoResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeOpenApiInfoResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>358E012F-B516-599D-9ED0-A1A361CDE615</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenApiInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenApiInfoResponseBody self = new DescribeOpenApiInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenApiInfoResponseBody setData(DescribeOpenApiInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOpenApiInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeOpenApiInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOpenApiInfoResponseBodyData extends TeaModel {
        /**
         * <p>The description of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>describeEcs</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The input parameters of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("InputParams")
        public String inputParams;

        /**
         * <p>The output parameters of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("OutputParams")
        public String outputParams;

        /**
         * <p>The sample response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("ResponseDemo")
        public String responseDemo;

        /**
         * <p>The summary of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>describeEcs</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The title of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>describeEcs</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribeOpenApiInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenApiInfoResponseBodyData self = new DescribeOpenApiInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOpenApiInfoResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeOpenApiInfoResponseBodyData setInputParams(String inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public String getInputParams() {
            return this.inputParams;
        }

        public DescribeOpenApiInfoResponseBodyData setOutputParams(String outputParams) {
            this.outputParams = outputParams;
            return this;
        }
        public String getOutputParams() {
            return this.outputParams;
        }

        public DescribeOpenApiInfoResponseBodyData setResponseDemo(String responseDemo) {
            this.responseDemo = responseDemo;
            return this;
        }
        public String getResponseDemo() {
            return this.responseDemo;
        }

        public DescribeOpenApiInfoResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribeOpenApiInfoResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
