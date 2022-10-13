// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CheckUserFinishAdRequest extends TeaModel {
    @NameInMap("Adid")
    public Long adid;

    @NameInMap("Clicklink")
    public String clicklink;

    @NameInMap("Id")
    public String id;

    @NameInMap("Mediaid")
    public String mediaid;

    @NameInMap("Tagid")
    public String tagid;

    @NameInMap("Uid")
    public String uid;

    public static CheckUserFinishAdRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserFinishAdRequest self = new CheckUserFinishAdRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserFinishAdRequest setAdid(Long adid) {
        this.adid = adid;
        return this;
    }
    public Long getAdid() {
        return this.adid;
    }

    public CheckUserFinishAdRequest setClicklink(String clicklink) {
        this.clicklink = clicklink;
        return this;
    }
    public String getClicklink() {
        return this.clicklink;
    }

    public CheckUserFinishAdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CheckUserFinishAdRequest setMediaid(String mediaid) {
        this.mediaid = mediaid;
        return this;
    }
    public String getMediaid() {
        return this.mediaid;
    }

    public CheckUserFinishAdRequest setTagid(String tagid) {
        this.tagid = tagid;
        return this;
    }
    public String getTagid() {
        return this.tagid;
    }

    public CheckUserFinishAdRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
