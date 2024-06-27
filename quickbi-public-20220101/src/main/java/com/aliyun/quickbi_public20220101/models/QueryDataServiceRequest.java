// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataServiceRequest extends TeaModel {
    /**
     * <p>Call an API that is created in DataService Studio.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f4cc43bc3***</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <h1>Prerequisites</h1>
     * <p>You can use the Quick BI data service to create an API for the data service. For more information, see <a href="https://help.aliyun.com/document_detail/144980.html">Data service</a>.</p>
     * <h1>Limits</h1>
     * <ul>
     * <li>The Data Service feature is available only to Professional customers.</li>
     * <li>The timeout period for API calls is 60s. The QPS of a single API is 10 times per second.</li>
     * <li>If row-level permissions are enabled for datasets that are referenced by a Data Service API, the API may be blocked by row-level permission policies.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>For more information about API IDs in DataService, see <a href="https://help.aliyun.com/document_detail/144980.html">Data Service</a>.</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>The query conditions of the data service. The query conditions are specified in the form of keys and values. A string of the map type. Key is the name of the request parameters parameter, and Value is the value of the request parameters parameter. Key and Value must appear in pairs.</p>
     * <p><strong>Note:</strong></p>
     * <ul>
     * <li><p>If a value contains multiple values, the value is a List in the JSON format. Example: <code>area=[&quot;East China&quot;,&quot;North China&quot;,&quot;South China&quot;]</code></p>
     * </li>
     * <li><p>For dates, different input parameter formats are provided based on different types:</p>
     * <ul>
     * <li>Year: 2019</li>
     * <li>Season: 2019Q1</li>
     * <li>Month: 201901 (carry 0)</li>
     * <li>Week: 2019-52</li>
     * <li>Day: 20190101</li>
     * <li>Hours: 14:00:00 (minutes and seconds are 00)</li>
     * <li>Minutes: 14:12:00 (seconds are 00)</li>
     * <li>Seconds: 14:34:34</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;area&quot;, &quot;city&quot;, &quot;price&quot;, &quot;date&quot;]</p>
     */
    @NameInMap("ReturnFields")
    public String returnFields;

    public static QueryDataServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataServiceRequest self = new QueryDataServiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataServiceRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public QueryDataServiceRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public QueryDataServiceRequest setReturnFields(String returnFields) {
        this.returnFields = returnFields;
        return this;
    }
    public String getReturnFields() {
        return this.returnFields;
    }

}
