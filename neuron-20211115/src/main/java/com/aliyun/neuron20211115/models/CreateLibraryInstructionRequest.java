// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateLibraryInstructionRequest extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("document")
    public String document;

    @NameInMap("id")
    public Integer id;

    @NameInMap("libraryId")
    public String libraryId;

    @NameInMap("marketId")
    public Long marketId;

    public static CreateLibraryInstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLibraryInstructionRequest self = new CreateLibraryInstructionRequest();
        return TeaModel.build(map, self);
    }

    public CreateLibraryInstructionRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public CreateLibraryInstructionRequest setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public CreateLibraryInstructionRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public CreateLibraryInstructionRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public CreateLibraryInstructionRequest setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

}
