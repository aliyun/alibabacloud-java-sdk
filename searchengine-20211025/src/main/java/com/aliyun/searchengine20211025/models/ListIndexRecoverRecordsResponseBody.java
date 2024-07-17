// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListIndexRecoverRecordsResponseBody extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("desc")
    public String desc;

    /**
     * <p>The time when the index version was published.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-07 16:43:00</p>
     */
    @NameInMap("finishedTime")
    public String finishedTime;

    /**
     * <p>The ID of the full index version.</p>
     * 
     * <strong>example:</strong>
     * <p>1708674867</p>
     */
    @NameInMap("generationId")
    public String generationId;

    public static ListIndexRecoverRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndexRecoverRecordsResponseBody self = new ListIndexRecoverRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndexRecoverRecordsResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ListIndexRecoverRecordsResponseBody setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public ListIndexRecoverRecordsResponseBody setGenerationId(String generationId) {
        this.generationId = generationId;
        return this;
    }
    public String getGenerationId() {
        return this.generationId;
    }

}
