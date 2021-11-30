// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ReplicationRule extends TeaModel {
    // A short description of action
    @NameInMap("Action")
    public String action;

    @NameInMap("Destination")
    public ReplicationDestination destination;

    // A short description of EncryptionConfiguration
    @NameInMap("EncryptionConfiguration")
    public ReplicationRuleEncryptionConfiguration encryptionConfiguration;

    // A short description of HistoricalObjectReplication
    @NameInMap("HistoricalObjectReplication")
    public String historicalObjectReplication;

    // rule id
    @NameInMap("ID")
    public String ID;

    @NameInMap("PrefixSet")
    public ReplicationPrefixSet prefixSet;

    @NameInMap("SourceSelectionCriteria")
    public ReplicationSourceSelectionCriteria sourceSelectionCriteria;

    // A short description of SyncRole
    @NameInMap("SyncRole")
    public String syncRole;

    public static ReplicationRule build(java.util.Map<String, ?> map) throws Exception {
        ReplicationRule self = new ReplicationRule();
        return TeaModel.build(map, self);
    }

    public ReplicationRule setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ReplicationRule setDestination(ReplicationDestination destination) {
        this.destination = destination;
        return this;
    }
    public ReplicationDestination getDestination() {
        return this.destination;
    }

    public ReplicationRule setEncryptionConfiguration(ReplicationRuleEncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
        return this;
    }
    public ReplicationRuleEncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    public ReplicationRule setHistoricalObjectReplication(String historicalObjectReplication) {
        this.historicalObjectReplication = historicalObjectReplication;
        return this;
    }
    public String getHistoricalObjectReplication() {
        return this.historicalObjectReplication;
    }

    public ReplicationRule setID(String ID) {
        this.ID = ID;
        return this;
    }
    public String getID() {
        return this.ID;
    }

    public ReplicationRule setPrefixSet(ReplicationPrefixSet prefixSet) {
        this.prefixSet = prefixSet;
        return this;
    }
    public ReplicationPrefixSet getPrefixSet() {
        return this.prefixSet;
    }

    public ReplicationRule setSourceSelectionCriteria(ReplicationSourceSelectionCriteria sourceSelectionCriteria) {
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        return this;
    }
    public ReplicationSourceSelectionCriteria getSourceSelectionCriteria() {
        return this.sourceSelectionCriteria;
    }

    public ReplicationRule setSyncRole(String syncRole) {
        this.syncRole = syncRole;
        return this;
    }
    public String getSyncRole() {
        return this.syncRole;
    }

    public static class ReplicationRuleEncryptionConfiguration extends TeaModel {
        // kms id
        @NameInMap("ReplicaKmsKeyID")
        public String replicaKmsKeyID;

        public static ReplicationRuleEncryptionConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ReplicationRuleEncryptionConfiguration self = new ReplicationRuleEncryptionConfiguration();
            return TeaModel.build(map, self);
        }

        public ReplicationRuleEncryptionConfiguration setReplicaKmsKeyID(String replicaKmsKeyID) {
            this.replicaKmsKeyID = replicaKmsKeyID;
            return this;
        }
        public String getReplicaKmsKeyID() {
            return this.replicaKmsKeyID;
        }

    }

}
