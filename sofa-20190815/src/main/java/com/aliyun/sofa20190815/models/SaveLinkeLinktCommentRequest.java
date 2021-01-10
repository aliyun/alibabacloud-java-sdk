// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktCommentRequest extends TeaModel {
    @NameInMap("CommentsDOJsonStr")
    public String commentsDOJsonStr;

    @NameInMap("WorkItemSign")
    public String workItemSign;

    public static SaveLinkeLinktCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktCommentRequest self = new SaveLinkeLinktCommentRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktCommentRequest setCommentsDOJsonStr(String commentsDOJsonStr) {
        this.commentsDOJsonStr = commentsDOJsonStr;
        return this;
    }
    public String getCommentsDOJsonStr() {
        return this.commentsDOJsonStr;
    }

    public SaveLinkeLinktCommentRequest setWorkItemSign(String workItemSign) {
        this.workItemSign = workItemSign;
        return this;
    }
    public String getWorkItemSign() {
        return this.workItemSign;
    }

}
