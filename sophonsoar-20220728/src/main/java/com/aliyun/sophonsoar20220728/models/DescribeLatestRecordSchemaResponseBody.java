// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeLatestRecordSchemaResponseBody extends TeaModel {
    /**
     * <p>The output structure information of the playbook.</p>
     */
    @NameInMap("PlaybookNodeSchema")
    public DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchema playbookNodeSchema;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLatestRecordSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestRecordSchemaResponseBody self = new DescribeLatestRecordSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLatestRecordSchemaResponseBody setPlaybookNodeSchema(DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchema playbookNodeSchema) {
        this.playbookNodeSchema = playbookNodeSchema;
        return this;
    }
    public DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchema getPlaybookNodeSchema() {
        return this.playbookNodeSchema;
    }

    public DescribeLatestRecordSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchemaNodeSchema extends TeaModel {
        /**
         * <p>The action name of the component.</p>
         */
        @NameInMap("ActionName")
        public String actionName;

        /**
         * <p>The name of the component.</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The output fields.</p>
         */
        @NameInMap("OutputFields")
        public java.util.List<String> outputFields;

        public static DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchemaNodeSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchemaNodeSchema self = new DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchemaNodeSchema();
            return TeaModel.build(map, self);
        }

        public DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchemaNodeSchema setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchemaNodeSchema setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchemaNodeSchema setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchemaNodeSchema setOutputFields(java.util.List<String> outputFields) {
            this.outputFields = outputFields;
            return this;
        }
        public java.util.List<String> getOutputFields() {
            return this.outputFields;
        }

    }

    public static class DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchema extends TeaModel {
        /**
         * <p>The structure information.</p>
         */
        @NameInMap("NodeSchema")
        public java.util.List<DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchemaNodeSchema> nodeSchema;

        public static DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchema self = new DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchema();
            return TeaModel.build(map, self);
        }

        public DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchema setNodeSchema(java.util.List<DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchemaNodeSchema> nodeSchema) {
            this.nodeSchema = nodeSchema;
            return this;
        }
        public java.util.List<DescribeLatestRecordSchemaResponseBodyPlaybookNodeSchemaNodeSchema> getNodeSchema() {
            return this.nodeSchema;
        }

    }

}
