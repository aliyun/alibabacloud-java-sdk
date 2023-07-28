// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionRiskyTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about high-risk tasks.</p>
     */
    @NameInMap("RiskyTasks")
    public java.util.List<ListExecutionRiskyTasksResponseBodyRiskyTasks> riskyTasks;

    public static ListExecutionRiskyTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionRiskyTasksResponseBody self = new ListExecutionRiskyTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutionRiskyTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExecutionRiskyTasksResponseBody setRiskyTasks(java.util.List<ListExecutionRiskyTasksResponseBodyRiskyTasks> riskyTasks) {
        this.riskyTasks = riskyTasks;
        return this;
    }
    public java.util.List<ListExecutionRiskyTasksResponseBodyRiskyTasks> getRiskyTasks() {
        return this.riskyTasks;
    }

    public static class ListExecutionRiskyTasksResponseBodyRiskyTasks extends TeaModel {
        /**
         * <p>The name of the operation that the high-risk task calls.</p>
         */
        @NameInMap("API")
        public String API;

        /**
         * <p>The cloud service in which the high-risk task runs.</p>
         */
        @NameInMap("Service")
        public String service;

        /**
         * <p>The details of the high-risk task.</p>
         */
        @NameInMap("Task")
        public java.util.List<String> task;

        /**
         * <p>The details of templates to which the high-risk task belongs.</p>
         */
        @NameInMap("Template")
        public java.util.List<String> template;

        public static ListExecutionRiskyTasksResponseBodyRiskyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionRiskyTasksResponseBodyRiskyTasks self = new ListExecutionRiskyTasksResponseBodyRiskyTasks();
            return TeaModel.build(map, self);
        }

        public ListExecutionRiskyTasksResponseBodyRiskyTasks setAPI(String API) {
            this.API = API;
            return this;
        }
        public String getAPI() {
            return this.API;
        }

        public ListExecutionRiskyTasksResponseBodyRiskyTasks setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListExecutionRiskyTasksResponseBodyRiskyTasks setTask(java.util.List<String> task) {
            this.task = task;
            return this;
        }
        public java.util.List<String> getTask() {
            return this.task;
        }

        public ListExecutionRiskyTasksResponseBodyRiskyTasks setTemplate(java.util.List<String> template) {
            this.template = template;
            return this;
        }
        public java.util.List<String> getTemplate() {
            return this.template;
        }

    }

}
