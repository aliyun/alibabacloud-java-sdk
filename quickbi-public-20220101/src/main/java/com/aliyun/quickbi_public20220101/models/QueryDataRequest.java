// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataRequest extends TeaModel {
    /**
     * <p>The API ID in the data service. For more information, see: <a href="https://help.aliyun.com/document_detail/144980.html">Data Service</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f4cc43bc3***</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The query conditions for the data service, passed in as Key and Value pairs. A map-type string. Here, Key is the name of the request parameter, and Value is the value of the request parameter. Key and Value must appear in pairs.</p>
     * <p><strong>Note:</strong></p>
     * <ul>
     * <li><p>When the operator of the request parameter is set to <strong>enumeration filtering</strong>, the value can contain multiple values, and the format of the value should be a JSON-formatted List. For example: <code>area=[&quot;East China&quot;,&quot;North China&quot;,&quot;South China&quot;]</code></p>
     * </li>
     * <li><p>For dates, different formats are provided based on the type:</p>
     * <ul>
     * <li><p>Year: 2019</p>
     * </li>
     * <li><p>Quarter: 2019Q1</p>
     * </li>
     * <li><p>Month: 201901 (with leading zero)</p>
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
     * <p>{ &quot;area&quot;: [&quot;华东&quot;, &quot;华北&quot;],  &quot;shopping_date&quot;: &quot;2019Q1&quot;,  }</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>A list of return parameter names, in a List-type string.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;area&quot;, &quot;city&quot;, &quot;price&quot;, &quot;date&quot;]</p>
     */
    @NameInMap("ReturnFields")
    public String returnFields;

    /**
     * <p>The userId in Quick BI. For how to obtain the userId, see: <a href="https://next.api.aliyun.com/document/quickbi-public/2022-01-01/QueryUserInfoByAccount">Query User Information by Account Interface</a></p>
     * <blockquote>
     * <p>This parameter is used to specify the identity of the person using the data service, which can be used in conjunction with the row and column permission configurations of the dataset.</p>
     * </blockquote>
     * <blockquote>
     * <p>Notice: If the parameter is not passed, an empty string is passed, or null is passed, the default userId will be the owner of the current Quick BI organization.</notice></p>
     * </blockquote>
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
