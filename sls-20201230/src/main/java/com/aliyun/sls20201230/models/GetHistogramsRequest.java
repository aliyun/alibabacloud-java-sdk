// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetHistogramsRequest extends TeaModel {
    /**
     * <p>The start time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("from")
    public Long from;

    /**
     * <p>The search statement. Only search statements are supported. Analytic statements are not supported. For more information about the syntax of search statements, see [Log search overview](~~43772~~).</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The end time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("to")
    public Long to;

    /**
     * <p>The topic of the logs.</p>
     */
    @NameInMap("topic")
    public String topic;

    public static GetHistogramsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistogramsRequest self = new GetHistogramsRequest();
        return TeaModel.build(map, self);
    }

    public GetHistogramsRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetHistogramsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetHistogramsRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public GetHistogramsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
