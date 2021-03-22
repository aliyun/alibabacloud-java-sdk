// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleRulesResponseBody extends TeaModel {
    @NameInMap("ModuleRules")
    public java.util.List<DescribeProtectionModuleRulesResponseBodyModuleRules> moduleRules;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    public static DescribeProtectionModuleRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtectionModuleRulesResponseBody self = new DescribeProtectionModuleRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProtectionModuleRulesResponseBody setModuleRules(java.util.List<DescribeProtectionModuleRulesResponseBodyModuleRules> moduleRules) {
        this.moduleRules = moduleRules;
        return this;
    }
    public java.util.List<DescribeProtectionModuleRulesResponseBodyModuleRules> getModuleRules() {
        return this.moduleRules;
    }

    public DescribeProtectionModuleRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProtectionModuleRulesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeProtectionModuleRulesResponseBody setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public static class DescribeProtectionModuleRulesResponseBodyModuleRules extends TeaModel {
        @NameInMap("Time")
        public Long time;

        @NameInMap("Version")
        public Long version;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Long id;

        public static DescribeProtectionModuleRulesResponseBodyModuleRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeProtectionModuleRulesResponseBodyModuleRules self = new DescribeProtectionModuleRulesResponseBodyModuleRules();
            return TeaModel.build(map, self);
        }

        public DescribeProtectionModuleRulesResponseBodyModuleRules setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeProtectionModuleRulesResponseBodyModuleRules setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeProtectionModuleRulesResponseBodyModuleRules setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeProtectionModuleRulesResponseBodyModuleRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
