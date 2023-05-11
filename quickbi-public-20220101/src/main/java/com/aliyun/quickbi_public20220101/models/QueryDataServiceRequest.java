// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataServiceRequest extends TeaModel {
    /**
     * <p>Call an API that is created in DataService Studio.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p># Prerequisites</p>
     * <br>
     * <p>You can use the Quick BI data service to create an API for the data service. For more information, see [Data service](~~144980~~).</p>
     * <br>
     * <p># Limits</p>
     * <br>
     * <p>*   The Data Service feature is available only to Professional customers.</p>
     * <p>*   The timeout period for API calls is 60s. The QPS of a single API is 10 times per second.</p>
     * <p>*   If row-level permissions are enabled for datasets that are referenced by a Data Service API, the API may be blocked by row-level permission policies.</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>The query conditions of the data service. The query conditions are specified in the form of keys and values. A string of the map type. Key is the name of the request parameters parameter, and Value is the value of the request parameters parameter. Key and Value must appear in pairs.</p>
     * <br>
     * <p>**Note:**</p>
     * <br>
     * <p>*   If a value contains multiple values, the value is a List in the JSON format. Example: `area=["East China","North China","South China"]`</p>
     * <br>
     * <p>*   For dates, different input parameter formats are provided based on different types:</p>
     * <br>
     * <p>    *   Year: 2019</p>
     * <p>    *   Season: 2019Q1</p>
     * <p>    *   Month: 201901 (carry 0)</p>
     * <p>    *   Week: 2019-52</p>
     * <p>    *   Day: 20190101</p>
     * <p>    *   Hours: 14:00:00 (minutes and seconds are 00)</p>
     * <p>    *   Minutes: 14:12:00 (seconds are 00)</p>
     * <p>    *   Seconds: 14:34:34</p>
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
