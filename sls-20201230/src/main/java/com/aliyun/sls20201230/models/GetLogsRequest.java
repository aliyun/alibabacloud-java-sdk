// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsRequest extends TeaModel {
    // 查询开始时间点。该时间是指写入日志数据时指定的日志时间。
    // 
    // 请求参数from和to定义的时间区间遵循左闭右开原则，即该时间区间包括区间开始时间点，但不包括区间结束时间点。如果from和to的值相同，则为无效区间，函数直接返回错误。
    // Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
    @NameInMap("from")
    public Long from;

    // 仅当query参数为查询语句时，该参数有效，表示请求返回的最大日志条数。最小值为0，最大值为100，默认值为100。
    @NameInMap("line")
    public Long line;

    // 仅当query参数为查询语句时，该参数有效，表示查询开始行。默认值为0。
    @NameInMap("offset")
    public Long offset;

    // 用于指定返回结果是否按日志时间戳降序返回日志，精确到分钟级别。
    // 
    // true：按照日志时间戳降序返回日志。
    // false（默认值）：按照日志时间戳升序返回日志。
    // 注意
    // 当query参数为查询语句时，参数reverse有效，用于指定返回日志排序方式。
    // 当query参数为查询和分析语句时，参数reverse无效，由SQL分析语句中order by语法指定排序方式。如果order by为asc（默认），则为升序；如果order by为desc，则为降序。
    @NameInMap("powerSql")
    public Boolean powerSql;

    // 查询语句或者分析语句。更多信息，请参见查询概述和分析概述。
    // 
    // 在query参数的分析语句中加上set session parallel_sql=true;，表示使用SQL独享版。例如* | set session parallel_sql=true; select count(*) as pv 。
    // 
    // 说明 当query参数中有分析语句（SQL语句）时，该接口的line参数和offset参数无效，建议设置为0，需通过SQL语句的LIMIT语法实现翻页。更多信息，请参见分页显示查询分析结果。
    @NameInMap("query")
    public String query;

    // 用于指定返回结果是否按日志时间戳降序返回日志，精确到分钟级别。
    // 
    // true：按照日志时间戳降序返回日志。
    // false（默认值）：按照日志时间戳升序返回日志。
    // 注意
    // 当query参数为查询语句时，参数reverse有效，用于指定返回日志排序方式。
    // 当query参数为查询和分析语句时，参数reverse无效，由SQL分析语句中order by语法指定排序方式。如果order by为asc（默认），则为升序；如果order by为desc，则为降序。
    @NameInMap("reverse")
    public Boolean reverse;

    // 查询结束时间点。该时间是指写入日志数据时指定的日志时间。
    // 
    // 请求参数from和to定义的时间区间遵循左闭右开原则，即该时间区间包括区间开始时间点，但不包括区间结束时间点。如果from和to的值相同，则为无效区间，函数直接返回错误。
    // Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
    @NameInMap("to")
    public Long to;

    // status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5
    @NameInMap("topic")
    public String topic;

    // 查询Logstore数据的类型。在该接口中固定取值为log。
    @NameInMap("type")
    public String type;

    public static GetLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogsRequest self = new GetLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetLogsRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetLogsRequest setLine(Long line) {
        this.line = line;
        return this;
    }
    public Long getLine() {
        return this.line;
    }

    public GetLogsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public GetLogsRequest setPowerSql(Boolean powerSql) {
        this.powerSql = powerSql;
        return this;
    }
    public Boolean getPowerSql() {
        return this.powerSql;
    }

    public GetLogsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetLogsRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public GetLogsRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public GetLogsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public GetLogsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
