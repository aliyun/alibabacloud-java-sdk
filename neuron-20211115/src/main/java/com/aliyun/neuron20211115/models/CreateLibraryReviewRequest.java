// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateLibraryReviewRequest extends TeaModel {
    @NameInMap("libraryName")
    public String libraryName;

    @NameInMap("libraryUrl")
    public String libraryUrl;

    @NameInMap("libraryVersion")
    public String libraryVersion;

    @NameInMap("marketId")
    public String marketId;

    @NameInMap("reviewerId")
    public String reviewerId;

    public static CreateLibraryReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLibraryReviewRequest self = new CreateLibraryReviewRequest();
        return TeaModel.build(map, self);
    }

    public CreateLibraryReviewRequest setLibraryName(String libraryName) {
        this.libraryName = libraryName;
        return this;
    }
    public String getLibraryName() {
        return this.libraryName;
    }

    public CreateLibraryReviewRequest setLibraryUrl(String libraryUrl) {
        this.libraryUrl = libraryUrl;
        return this;
    }
    public String getLibraryUrl() {
        return this.libraryUrl;
    }

    public CreateLibraryReviewRequest setLibraryVersion(String libraryVersion) {
        this.libraryVersion = libraryVersion;
        return this;
    }
    public String getLibraryVersion() {
        return this.libraryVersion;
    }

    public CreateLibraryReviewRequest setMarketId(String marketId) {
        this.marketId = marketId;
        return this;
    }
    public String getMarketId() {
        return this.marketId;
    }

    public CreateLibraryReviewRequest setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
        return this;
    }
    public String getReviewerId() {
        return this.reviewerId;
    }

}
