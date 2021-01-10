// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktWorkitemreviewcommentRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Status")
    public String status;

    public static SaveLinkeLinktWorkitemreviewcommentRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktWorkitemreviewcommentRequest self = new SaveLinkeLinktWorkitemreviewcommentRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktWorkitemreviewcommentRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public SaveLinkeLinktWorkitemreviewcommentRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SaveLinkeLinktWorkitemreviewcommentRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
