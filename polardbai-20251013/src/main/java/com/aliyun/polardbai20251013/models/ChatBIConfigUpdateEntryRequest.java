// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIConfigUpdateEntryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db_test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>若formula_function为总销售额：SUM(销售额)，则在最终处理时，问题中的总销售额将采用SUM(销售额)公式作为附加信息一并进行处理。</p>
     */
    @NameInMap("FormulaFunction")
    public String formulaFunction;

    /**
     * <strong>example:</strong>
     * <p>1</p>
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
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsFunctional")
    public Integer isFunctional;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>若query_function为{&quot;append&quot;:[&quot;一&quot;,&quot;二&quot;],&quot;delete&quot;:[&quot;？&quot;],&quot;replace&quot;:{&quot;张三&quot;:&quot;a&quot;,&quot;李四&quot;:&quot;b&quot;}}，则表示：当text_condition匹配时，在问题的结尾添加一和二，并删除问题中的？。最后，将问题中的张三替换为a，将李四替换为b。</p>
     * <p>例如：
     * 问题张三今年总销售额是多少？：在text_condition匹配时，会最终被处理为a今年总销售额是多少一二。
     * 问题李四今年总销售额多少？：在text_condition匹配时，会最终被处理为b今年总销售额是多少一二。</p>
     */
    @NameInMap("QueryFunction")
    public String queryFunction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>若sql_condition=students||student_courses&amp;&amp;!!courses，则表示：如果表students或表student_courses在SQL中，且表courses不在SQL中，则条件匹配。</p>
     * <p>例如：
     * SQL语句SELECT * FROM student_courses：条件匹配。
     * SQL语句SELECT c.course_name FROM student_courses sc JOIN courses c ON sc.courses_id = c.id;：条件不匹配。</p>
     */
    @NameInMap("SqlCondition")
    public String sqlCondition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>若sql_function={&quot;replace&quot;:{&quot;status = &quot;请假&quot;&quot;:&quot;status = 0&quot;,&quot;status = &quot;出勤&quot;&quot;:&quot;status = 1&quot;}}，则表示：在sql_condition匹配的情况下，将SQL中的status = &quot;请假&quot;替换为status = 0，status = &quot;出勤&quot;替换为status = 1。</p>
     */
    @NameInMap("SqlFunction")
    public String sqlFunction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>若text_condition为张三||李四&amp;&amp;!!王五，则表示当问题包含张三，或者包含李四且不包含王五时，条件匹配。</p>
     * <p>例如：
     * 张三今年总销售额多少？：条件匹配。
     * 李四今年总销售额多少？：条件匹配。
     * 李四王五今年总销售额多少？：条件不匹配。</p>
     */
    @NameInMap("TextCondition")
    public String textCondition;

    public static ChatBIConfigUpdateEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBIConfigUpdateEntryRequest self = new ChatBIConfigUpdateEntryRequest();
        return TeaModel.build(map, self);
    }

    public ChatBIConfigUpdateEntryRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ChatBIConfigUpdateEntryRequest setFormulaFunction(String formulaFunction) {
        this.formulaFunction = formulaFunction;
        return this;
    }
    public String getFormulaFunction() {
        return this.formulaFunction;
    }

    public ChatBIConfigUpdateEntryRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public ChatBIConfigUpdateEntryRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ChatBIConfigUpdateEntryRequest setIsFunctional(Integer isFunctional) {
        this.isFunctional = isFunctional;
        return this;
    }
    public Integer getIsFunctional() {
        return this.isFunctional;
    }

    public ChatBIConfigUpdateEntryRequest setQueryFunction(String queryFunction) {
        this.queryFunction = queryFunction;
        return this;
    }
    public String getQueryFunction() {
        return this.queryFunction;
    }

    public ChatBIConfigUpdateEntryRequest setSqlCondition(String sqlCondition) {
        this.sqlCondition = sqlCondition;
        return this;
    }
    public String getSqlCondition() {
        return this.sqlCondition;
    }

    public ChatBIConfigUpdateEntryRequest setSqlFunction(String sqlFunction) {
        this.sqlFunction = sqlFunction;
        return this;
    }
    public String getSqlFunction() {
        return this.sqlFunction;
    }

    public ChatBIConfigUpdateEntryRequest setTextCondition(String textCondition) {
        this.textCondition = textCondition;
        return this;
    }
    public String getTextCondition() {
        return this.textCondition;
    }

}
