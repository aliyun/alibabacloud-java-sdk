// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetHistogramsRequest extends TeaModel {
    // 查询开始时间点。UNIX时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
    // 
    // 时间区间遵循“左闭右开”原则，即该时间区间包括区间开始时间点，但不包括区间结束时间点。如果from和to的值相同，则为无效区间，函数直接返回错误。
    @NameInMap("from")
    public Long from;

    // 查询语句。仅支持查询语句，不支持分析语句。关于查询语句的详细语法，请参见查询语法。
    @NameInMap("query")
    public String query;

    // 查询结束时间点。UNIX时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
    // 
    // 时间区间遵循“左闭右开”原则，即该时间区间包括区间开始时间点，但不包括区间结束时间点。如果from和to的值相同，则为无效区间，函数直接返回错误。
    @NameInMap("to")
    public Long to;

    // 日志主题。
    @NameInMap("topic")
    public String topic;

    // Logstore中数据的类型。该接口中固定取值为histogram。
    @NameInMap("type")
    public String type;

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

    public GetHistogramsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
