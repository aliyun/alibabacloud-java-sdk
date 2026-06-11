// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataRequest extends TeaModel {
    /**
     * <p>The API ID in <a href="https://help.aliyun.com/document_detail/144980.html">DataService Studio</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f4cc43bc3***</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>Filter conditions as a JSON map string. Each key is a request parameter name, and each value is the parameter value.</p>
     * <p><strong>Note:</strong></p>
     * <ul>
     * <li><p>If the operator of a request parameter is set to <strong>Enumeration Filter</strong>, the value can contain multiple values. In this case, the value must be in the format of a JSON list. For example: <code>area=[&quot;East China&quot;,&quot;North China&quot;,&quot;South China&quot;]</code></p>
     * </li>
     * <li><p>For dates, use the following formats based on the date type:</p>
     * <ul>
     * <li><p>Year: 2019</p>
     * </li>
     * <li><p>Quarter: 2019Q1</p>
     * </li>
     * <li><p>Month: 201901 (with a leading zero)</p>
     * </li>
     * <li><p>Week: 2019-52</p>
     * </li>
     * <li><p>Day: 20190101</p>
     * </li>
     * <li><p>Hour: 14:00:00 (minutes and seconds are 00)</p>
     * </li>
     * <li><p>Minute: 14:12:00 (seconds are 00)</p>
     * </li>
     * <li><p>Second: 14:34:34</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;area&quot;: [&quot;test&quot;, &quot;test&quot;],  &quot;shopping_date&quot;: &quot;2019Q1&quot;,  }</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>A JSON array of field names to return.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;area&quot;, &quot;city&quot;, &quot;price&quot;, &quot;date&quot;]</p>
     */
    @NameInMap("ReturnFields")
    public String returnFields;

    /**
     * <p>The Quick BI user ID. Obtain this value from <a href="https://next.api.aliyun.com/document/quickbi-public/2022-01-01/QueryUserInfoByAccount">QueryUserInfoByAccount</a>.</p>
     * <blockquote>
     * <p>Specifies the user identity for DataService Studio, used with row-level and column-level permission configurations.</p>
     * </blockquote>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>If omitted, empty, or null, defaults to the Quick BI organization owner\&quot;s user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b5d8fd9348cc4327****afb604</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataRequest self = new QueryDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public QueryDataRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public QueryDataRequest setReturnFields(String returnFields) {
        this.returnFields = returnFields;
        return this;
    }
    public String getReturnFields() {
        return this.returnFields;
    }

    public QueryDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
