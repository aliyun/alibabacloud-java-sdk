// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateCloudNotePhrasesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21088b2617489486958531017d0b19</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloudNotePhrasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudNotePhrasesResponseBody self = new CreateCloudNotePhrasesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudNotePhrasesResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateCloudNotePhrasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
