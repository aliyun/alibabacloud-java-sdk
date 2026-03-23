// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Histogram extends TeaModel {
    /**
     * <p>该子时间区间内查询到的日志条数。</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <p>子时间区间的开始时间点。UNIX时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。</p>
     * 
     * <strong>example:</strong>
     * <p>1409529600</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>当前查询结果在该子时间区间内的结果是否完整。</p>
     * <ul>
     * <li>Complete：查询已经完成，返回结果为完整结果。</li>
     * <li>Incomplete：查询已经完成，返回结果为不完整结果，需要重复请求以获得完整结果。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Complete</p>
     */
    @NameInMap("progress")
    public String progress;

    /**
     * <p>子时间区间的结束时间点。UNIX时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。</p>
     * 
     * <strong>example:</strong>
     * <p>1409569200</p>
     */
    @NameInMap("to")
    public Integer to;

    public static Histogram build(java.util.Map<String, ?> map) throws Exception {
        Histogram self = new Histogram();
        return TeaModel.build(map, self);
    }

    public Histogram setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public Histogram setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public Histogram setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

    public Histogram setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
