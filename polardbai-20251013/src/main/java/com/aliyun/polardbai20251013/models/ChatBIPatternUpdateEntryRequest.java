// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternUpdateEntryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db_test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>1, 2, 3, ...</p>
     */
    @NameInMap("Id")
    public Integer id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>【课程名称】【授课状态】的课程有哪些？</p>
     */
    @NameInMap("PatternDescription")
    public String patternDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("PatternParams")
    public String patternParams;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>查询课程名称为#{courseName}授课状态为#{status}的课程</p>
     */
    @NameInMap("PatternQuestion")
    public String patternQuestion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT course_name, course_time, course_location 
     * FROM courses 
     * WHERE 
     * course_name=#{courseName} 
     * AND status=#{statusCode}</p>
     */
    @NameInMap("PatternSql")
    public String patternSql;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polar4ai_nl2sql_pattern, polar4ai_nl2sql_pattern_1</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static ChatBIPatternUpdateEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternUpdateEntryRequest self = new ChatBIPatternUpdateEntryRequest();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternUpdateEntryRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ChatBIPatternUpdateEntryRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public ChatBIPatternUpdateEntryRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ChatBIPatternUpdateEntryRequest setPatternDescription(String patternDescription) {
        this.patternDescription = patternDescription;
        return this;
    }
    public String getPatternDescription() {
        return this.patternDescription;
    }

    public ChatBIPatternUpdateEntryRequest setPatternParams(String patternParams) {
        this.patternParams = patternParams;
        return this;
    }
    public String getPatternParams() {
        return this.patternParams;
    }

    public ChatBIPatternUpdateEntryRequest setPatternQuestion(String patternQuestion) {
        this.patternQuestion = patternQuestion;
        return this;
    }
    public String getPatternQuestion() {
        return this.patternQuestion;
    }

    public ChatBIPatternUpdateEntryRequest setPatternSql(String patternSql) {
        this.patternSql = patternSql;
        return this;
    }
    public String getPatternSql() {
        return this.patternSql;
    }

    public ChatBIPatternUpdateEntryRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
