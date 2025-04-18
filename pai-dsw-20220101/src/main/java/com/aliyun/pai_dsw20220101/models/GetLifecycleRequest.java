// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetLifecycleRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of sessions to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The sorting order of the results. Valid values:</p>
     * <ul>
     * <li>ASC: sorted by time in ascending order.</li>
     * <li>DESC: sorted by time in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>A session refers to the process of an instance from startup to failure or shutdown. The sessionNumber indicates the offset value for the instance\&quot;s session sequence.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SessionNumber")
    public Integer sessionNumber;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The token used to share the URL.</p>
     */
    @NameInMap("Token")
    public String token;

    public static GetLifecycleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLifecycleRequest self = new GetLifecycleRequest();
        return TeaModel.build(map, self);
    }

    public GetLifecycleRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetLifecycleRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public GetLifecycleRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetLifecycleRequest setSessionNumber(Integer sessionNumber) {
        this.sessionNumber = sessionNumber;
        return this;
    }
    public Integer getSessionNumber() {
        return this.sessionNumber;
    }

    public GetLifecycleRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetLifecycleRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
