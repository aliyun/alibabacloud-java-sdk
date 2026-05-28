// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Histogram extends TeaModel {
    /**
     * <p>The number of logs that are generated during the subinterval.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <p>The start time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1409529600</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>Indicates whether the query result in the subinterval is complete. Valid values:</p>
     * <ul>
     * <li>Complete: The query is successful, and the complete result is returned.</li>
     * <li>Incomplete: The query is successful, but the query result is incomplete. To obtain the complete result, you must repeat the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Complete</p>
     */
    @NameInMap("progress")
    public String progress;

    /**
     * <p>The end time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
