// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDatabasesResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>E45380E8-994A-5402-9806-F114B3295FCF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>NodeTreeVO</p>
     */
    @NameInMap("result")
    public ListDatabasesResponseBodyResult result;

    public static ListDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesResponseBody self = new ListDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabasesResponseBody setResult(ListDatabasesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListDatabasesResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListDatabasesResponseBodyResultDatabasesSqlInstances extends TeaModel {
        @NameInMap("children")
        public java.util.List<?> children;

        /**
         * <strong>example:</strong>
         * <p>12190</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("instanceId")
        public Long instanceId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDir")
        public Integer isDir;

        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("parent")
        public Long parent;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("templateId")
        public Long templateId;

        /**
         * <p>table, instance, template, function</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDatabasesResponseBodyResultDatabasesSqlInstances build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyResultDatabasesSqlInstances self = new ListDatabasesResponseBodyResultDatabasesSqlInstances();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyResultDatabasesSqlInstances setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public ListDatabasesResponseBodyResultDatabasesSqlInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDatabasesResponseBodyResultDatabasesSqlInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListDatabasesResponseBodyResultDatabasesSqlInstances setIsDir(Integer isDir) {
            this.isDir = isDir;
            return this;
        }
        public Integer getIsDir() {
            return this.isDir;
        }

        public ListDatabasesResponseBodyResultDatabasesSqlInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatabasesResponseBodyResultDatabasesSqlInstances setParent(Long parent) {
            this.parent = parent;
            return this;
        }
        public Long getParent() {
            return this.parent;
        }

        public ListDatabasesResponseBodyResultDatabasesSqlInstances setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListDatabasesResponseBodyResultDatabasesSqlInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDatabasesResponseBodyResultDatabasesTables extends TeaModel {
        @NameInMap("children")
        public java.util.List<?> children;

        /**
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("instanceId")
        public Long instanceId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDir")
        public Integer isDir;

        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("parent")
        public Long parent;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("templateId")
        public Long templateId;

        /**
         * <p>table, instance, template, function</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDatabasesResponseBodyResultDatabasesTables build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyResultDatabasesTables self = new ListDatabasesResponseBodyResultDatabasesTables();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyResultDatabasesTables setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public ListDatabasesResponseBodyResultDatabasesTables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDatabasesResponseBodyResultDatabasesTables setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListDatabasesResponseBodyResultDatabasesTables setIsDir(Integer isDir) {
            this.isDir = isDir;
            return this;
        }
        public Integer getIsDir() {
            return this.isDir;
        }

        public ListDatabasesResponseBodyResultDatabasesTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatabasesResponseBodyResultDatabasesTables setParent(Long parent) {
            this.parent = parent;
            return this;
        }
        public Long getParent() {
            return this.parent;
        }

        public ListDatabasesResponseBodyResultDatabasesTables setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListDatabasesResponseBodyResultDatabasesTables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDatabasesResponseBodyResultDatabasesTemplates extends TeaModel {
        @NameInMap("children")
        public java.util.List<?> children;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("instanceId")
        public Long instanceId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDir")
        public Integer isDir;

        /**
         * <strong>example:</strong>
         * <p>c26_schema</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("parent")
        public Long parent;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("templateId")
        public Long templateId;

        /**
         * <p>table, instance, template, function</p>
         * 
         * <strong>example:</strong>
         * <p>template</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDatabasesResponseBodyResultDatabasesTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyResultDatabasesTemplates self = new ListDatabasesResponseBodyResultDatabasesTemplates();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyResultDatabasesTemplates setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public ListDatabasesResponseBodyResultDatabasesTemplates setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDatabasesResponseBodyResultDatabasesTemplates setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListDatabasesResponseBodyResultDatabasesTemplates setIsDir(Integer isDir) {
            this.isDir = isDir;
            return this;
        }
        public Integer getIsDir() {
            return this.isDir;
        }

        public ListDatabasesResponseBodyResultDatabasesTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatabasesResponseBodyResultDatabasesTemplates setParent(Long parent) {
            this.parent = parent;
            return this;
        }
        public Long getParent() {
            return this.parent;
        }

        public ListDatabasesResponseBodyResultDatabasesTemplates setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListDatabasesResponseBodyResultDatabasesTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDatabasesResponseBodyResultDatabases extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("database")
        public String database;

        @NameInMap("functions")
        public java.util.Map<String, java.util.List<ResultDatabasesFunctionsValue>> functions;

        @NameInMap("sqlInstances")
        public java.util.List<ListDatabasesResponseBodyResultDatabasesSqlInstances> sqlInstances;

        @NameInMap("tables")
        public java.util.List<ListDatabasesResponseBodyResultDatabasesTables> tables;

        @NameInMap("templates")
        public java.util.List<ListDatabasesResponseBodyResultDatabasesTemplates> templates;

        public static ListDatabasesResponseBodyResultDatabases build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyResultDatabases self = new ListDatabasesResponseBodyResultDatabases();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyResultDatabases setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public ListDatabasesResponseBodyResultDatabases setFunctions(java.util.Map<String, java.util.List<ResultDatabasesFunctionsValue>> functions) {
            this.functions = functions;
            return this;
        }
        public java.util.Map<String, java.util.List<ResultDatabasesFunctionsValue>> getFunctions() {
            return this.functions;
        }

        public ListDatabasesResponseBodyResultDatabases setSqlInstances(java.util.List<ListDatabasesResponseBodyResultDatabasesSqlInstances> sqlInstances) {
            this.sqlInstances = sqlInstances;
            return this;
        }
        public java.util.List<ListDatabasesResponseBodyResultDatabasesSqlInstances> getSqlInstances() {
            return this.sqlInstances;
        }

        public ListDatabasesResponseBodyResultDatabases setTables(java.util.List<ListDatabasesResponseBodyResultDatabasesTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListDatabasesResponseBodyResultDatabasesTables> getTables() {
            return this.tables;
        }

        public ListDatabasesResponseBodyResultDatabases setTemplates(java.util.List<ListDatabasesResponseBodyResultDatabasesTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<ListDatabasesResponseBodyResultDatabasesTemplates> getTemplates() {
            return this.templates;
        }

    }

    public static class ListDatabasesResponseBodyResult extends TeaModel {
        @NameInMap("databases")
        public java.util.List<ListDatabasesResponseBodyResultDatabases> databases;

        public static ListDatabasesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyResult self = new ListDatabasesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyResult setDatabases(java.util.List<ListDatabasesResponseBodyResultDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<ListDatabasesResponseBodyResultDatabases> getDatabases() {
            return this.databases;
        }

    }

}
