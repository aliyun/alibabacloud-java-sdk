// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotPersonTableRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PersonTable")
    public UpdateAiotPersonTableRequestPersonTable personTable;

    public static UpdateAiotPersonTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotPersonTableRequest self = new UpdateAiotPersonTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiotPersonTableRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAiotPersonTableRequest setPersonTable(UpdateAiotPersonTableRequestPersonTable personTable) {
        this.personTable = personTable;
        return this;
    }
    public UpdateAiotPersonTableRequestPersonTable getPersonTable() {
        return this.personTable;
    }

    public static class UpdateAiotPersonTableRequestPersonTable extends TeaModel {
        @NameInMap("PersonTableId")
        public String personTableId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public Long type;

        @NameInMap("VerificationModelList")
        public java.util.List<Long> verificationModelList;

        public static UpdateAiotPersonTableRequestPersonTable build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotPersonTableRequestPersonTable self = new UpdateAiotPersonTableRequestPersonTable();
            return TeaModel.build(map, self);
        }

        public UpdateAiotPersonTableRequestPersonTable setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

        public UpdateAiotPersonTableRequestPersonTable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAiotPersonTableRequestPersonTable setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public UpdateAiotPersonTableRequestPersonTable setVerificationModelList(java.util.List<Long> verificationModelList) {
            this.verificationModelList = verificationModelList;
            return this;
        }
        public java.util.List<Long> getVerificationModelList() {
            return this.verificationModelList;
        }

    }

}
