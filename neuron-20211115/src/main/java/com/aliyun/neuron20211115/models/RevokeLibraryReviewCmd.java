// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RevokeLibraryReviewCmd extends TeaModel {
    @NameInMap("libraryId")
    public Long libraryId;

    public static RevokeLibraryReviewCmd build(java.util.Map<String, ?> map) throws Exception {
        RevokeLibraryReviewCmd self = new RevokeLibraryReviewCmd();
        return TeaModel.build(map, self);
    }

    public RevokeLibraryReviewCmd setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public Long getLibraryId() {
        return this.libraryId;
    }

}
