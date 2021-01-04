// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionRiskyTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Service")
        public String service;

        @NameInMap("Task")
        public java.util.List<String> task;

        @NameInMap("API")
        public String API;

        @NameInMap("Template")
        public java.util.List<String> template;

        public static ListExecutionRiskyTasksResponseBodyRiskyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionRiskyTasksResponseBodyRiskyTasks self = new ListExecutionRiskyTasksResponseBodyRiskyTasks();
            return TeaModel.build(map, self);
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

        public ListExecutionRiskyTasksResponseBodyRiskyTasks setAPI(String API) {
            this.API = API;
            return this;
        }
        public String getAPI() {
            return this.API;
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
