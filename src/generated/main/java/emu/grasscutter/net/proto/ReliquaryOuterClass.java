// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Reliquary.proto

package emu.grasscutter.net.proto;

public final class ReliquaryOuterClass {
  private ReliquaryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Reliquary)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @return A list containing the appendPropIdList.
     */
    java.util.List<java.lang.Integer> getAppendPropIdListList();
    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @return The count of appendPropIdList.
     */
    int getAppendPropIdListCount();
    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The appendPropIdList at the given index.
     */
    int getAppendPropIdList(int index);

    /**
     * <code>uint32 promote_level = 3;</code>
     * @return The promoteLevel.
     */
    int getPromoteLevel();

    /**
     * <code>uint32 level = 1;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 main_prop_id = 4;</code>
     * @return The mainPropId.
     */
    int getMainPropId();

    /**
     * <code>uint32 exp = 2;</code>
     * @return The exp.
     */
    int getExp();

    /**
     * <code>bool GPPMHJLMIIF = 6;</code>
     * @return The gPPMHJLMIIF.
     */
    boolean getGPPMHJLMIIF();
  }
  /**
   * Protobuf type {@code Reliquary}
   */
  public static final class Reliquary extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Reliquary)
      ReliquaryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Reliquary.newBuilder() to construct.
    private Reliquary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Reliquary() {
      appendPropIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Reliquary();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Reliquary(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              level_ = input.readUInt32();
              break;
            }
            case 16: {

              exp_ = input.readUInt32();
              break;
            }
            case 24: {

              promoteLevel_ = input.readUInt32();
              break;
            }
            case 32: {

              mainPropId_ = input.readUInt32();
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                appendPropIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              appendPropIdList_.addInt(input.readUInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                appendPropIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                appendPropIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {

              gPPMHJLMIIF_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          appendPropIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ReliquaryOuterClass.internal_static_Reliquary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ReliquaryOuterClass.internal_static_Reliquary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.class, emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.Builder.class);
    }

    public static final int APPEND_PROP_ID_LIST_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList appendPropIdList_;
    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @return A list containing the appendPropIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAppendPropIdListList() {
      return appendPropIdList_;
    }
    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @return The count of appendPropIdList.
     */
    public int getAppendPropIdListCount() {
      return appendPropIdList_.size();
    }
    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The appendPropIdList at the given index.
     */
    public int getAppendPropIdList(int index) {
      return appendPropIdList_.getInt(index);
    }
    private int appendPropIdListMemoizedSerializedSize = -1;

    public static final int PROMOTE_LEVEL_FIELD_NUMBER = 3;
    private int promoteLevel_;
    /**
     * <code>uint32 promote_level = 3;</code>
     * @return The promoteLevel.
     */
    @java.lang.Override
    public int getPromoteLevel() {
      return promoteLevel_;
    }

    public static final int LEVEL_FIELD_NUMBER = 1;
    private int level_;
    /**
     * <code>uint32 level = 1;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int MAIN_PROP_ID_FIELD_NUMBER = 4;
    private int mainPropId_;
    /**
     * <code>uint32 main_prop_id = 4;</code>
     * @return The mainPropId.
     */
    @java.lang.Override
    public int getMainPropId() {
      return mainPropId_;
    }

    public static final int EXP_FIELD_NUMBER = 2;
    private int exp_;
    /**
     * <code>uint32 exp = 2;</code>
     * @return The exp.
     */
    @java.lang.Override
    public int getExp() {
      return exp_;
    }

    public static final int GPPMHJLMIIF_FIELD_NUMBER = 6;
    private boolean gPPMHJLMIIF_;
    /**
     * <code>bool GPPMHJLMIIF = 6;</code>
     * @return The gPPMHJLMIIF.
     */
    @java.lang.Override
    public boolean getGPPMHJLMIIF() {
      return gPPMHJLMIIF_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (level_ != 0) {
        output.writeUInt32(1, level_);
      }
      if (exp_ != 0) {
        output.writeUInt32(2, exp_);
      }
      if (promoteLevel_ != 0) {
        output.writeUInt32(3, promoteLevel_);
      }
      if (mainPropId_ != 0) {
        output.writeUInt32(4, mainPropId_);
      }
      if (getAppendPropIdListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(appendPropIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < appendPropIdList_.size(); i++) {
        output.writeUInt32NoTag(appendPropIdList_.getInt(i));
      }
      if (gPPMHJLMIIF_ != false) {
        output.writeBool(6, gPPMHJLMIIF_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, level_);
      }
      if (exp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, exp_);
      }
      if (promoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, promoteLevel_);
      }
      if (mainPropId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, mainPropId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < appendPropIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(appendPropIdList_.getInt(i));
        }
        size += dataSize;
        if (!getAppendPropIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        appendPropIdListMemoizedSerializedSize = dataSize;
      }
      if (gPPMHJLMIIF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, gPPMHJLMIIF_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary other = (emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) obj;

      if (!getAppendPropIdListList()
          .equals(other.getAppendPropIdListList())) return false;
      if (getPromoteLevel()
          != other.getPromoteLevel()) return false;
      if (getLevel()
          != other.getLevel()) return false;
      if (getMainPropId()
          != other.getMainPropId()) return false;
      if (getExp()
          != other.getExp()) return false;
      if (getGPPMHJLMIIF()
          != other.getGPPMHJLMIIF()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getAppendPropIdListCount() > 0) {
        hash = (37 * hash) + APPEND_PROP_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAppendPropIdListList().hashCode();
      }
      hash = (37 * hash) + PROMOTE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getPromoteLevel();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + MAIN_PROP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMainPropId();
      hash = (37 * hash) + EXP_FIELD_NUMBER;
      hash = (53 * hash) + getExp();
      hash = (37 * hash) + GPPMHJLMIIF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getGPPMHJLMIIF());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Reliquary}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Reliquary)
        emu.grasscutter.net.proto.ReliquaryOuterClass.ReliquaryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ReliquaryOuterClass.internal_static_Reliquary_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ReliquaryOuterClass.internal_static_Reliquary_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.class, emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        appendPropIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        promoteLevel_ = 0;

        level_ = 0;

        mainPropId_ = 0;

        exp_ = 0;

        gPPMHJLMIIF_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ReliquaryOuterClass.internal_static_Reliquary_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary build() {
        emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary buildPartial() {
        emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary result = new emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          appendPropIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.appendPropIdList_ = appendPropIdList_;
        result.promoteLevel_ = promoteLevel_;
        result.level_ = level_;
        result.mainPropId_ = mainPropId_;
        result.exp_ = exp_;
        result.gPPMHJLMIIF_ = gPPMHJLMIIF_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) {
          return mergeFrom((emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary other) {
        if (other == emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance()) return this;
        if (!other.appendPropIdList_.isEmpty()) {
          if (appendPropIdList_.isEmpty()) {
            appendPropIdList_ = other.appendPropIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAppendPropIdListIsMutable();
            appendPropIdList_.addAll(other.appendPropIdList_);
          }
          onChanged();
        }
        if (other.getPromoteLevel() != 0) {
          setPromoteLevel(other.getPromoteLevel());
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getMainPropId() != 0) {
          setMainPropId(other.getMainPropId());
        }
        if (other.getExp() != 0) {
          setExp(other.getExp());
        }
        if (other.getGPPMHJLMIIF() != false) {
          setGPPMHJLMIIF(other.getGPPMHJLMIIF());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList appendPropIdList_ = emptyIntList();
      private void ensureAppendPropIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          appendPropIdList_ = mutableCopy(appendPropIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @return A list containing the appendPropIdList.
       */
      public java.util.List<java.lang.Integer>
          getAppendPropIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(appendPropIdList_) : appendPropIdList_;
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @return The count of appendPropIdList.
       */
      public int getAppendPropIdListCount() {
        return appendPropIdList_.size();
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @param index The index of the element to return.
       * @return The appendPropIdList at the given index.
       */
      public int getAppendPropIdList(int index) {
        return appendPropIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The appendPropIdList to set.
       * @return This builder for chaining.
       */
      public Builder setAppendPropIdList(
          int index, int value) {
        ensureAppendPropIdListIsMutable();
        appendPropIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @param value The appendPropIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAppendPropIdList(int value) {
        ensureAppendPropIdListIsMutable();
        appendPropIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @param values The appendPropIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAppendPropIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAppendPropIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, appendPropIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAppendPropIdList() {
        appendPropIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int promoteLevel_ ;
      /**
       * <code>uint32 promote_level = 3;</code>
       * @return The promoteLevel.
       */
      @java.lang.Override
      public int getPromoteLevel() {
        return promoteLevel_;
      }
      /**
       * <code>uint32 promote_level = 3;</code>
       * @param value The promoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setPromoteLevel(int value) {
        
        promoteLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 promote_level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPromoteLevel() {
        
        promoteLevel_ = 0;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 1;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 1;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int mainPropId_ ;
      /**
       * <code>uint32 main_prop_id = 4;</code>
       * @return The mainPropId.
       */
      @java.lang.Override
      public int getMainPropId() {
        return mainPropId_;
      }
      /**
       * <code>uint32 main_prop_id = 4;</code>
       * @param value The mainPropId to set.
       * @return This builder for chaining.
       */
      public Builder setMainPropId(int value) {
        
        mainPropId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 main_prop_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMainPropId() {
        
        mainPropId_ = 0;
        onChanged();
        return this;
      }

      private int exp_ ;
      /**
       * <code>uint32 exp = 2;</code>
       * @return The exp.
       */
      @java.lang.Override
      public int getExp() {
        return exp_;
      }
      /**
       * <code>uint32 exp = 2;</code>
       * @param value The exp to set.
       * @return This builder for chaining.
       */
      public Builder setExp(int value) {
        
        exp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 exp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearExp() {
        
        exp_ = 0;
        onChanged();
        return this;
      }

      private boolean gPPMHJLMIIF_ ;
      /**
       * <code>bool GPPMHJLMIIF = 6;</code>
       * @return The gPPMHJLMIIF.
       */
      @java.lang.Override
      public boolean getGPPMHJLMIIF() {
        return gPPMHJLMIIF_;
      }
      /**
       * <code>bool GPPMHJLMIIF = 6;</code>
       * @param value The gPPMHJLMIIF to set.
       * @return This builder for chaining.
       */
      public Builder setGPPMHJLMIIF(boolean value) {
        
        gPPMHJLMIIF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool GPPMHJLMIIF = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGPPMHJLMIIF() {
        
        gPPMHJLMIIF_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Reliquary)
    }

    // @@protoc_insertion_point(class_scope:Reliquary)
    private static final emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary();
    }

    public static emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Reliquary>
        PARSER = new com.google.protobuf.AbstractParser<Reliquary>() {
      @java.lang.Override
      public Reliquary parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Reliquary(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Reliquary> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Reliquary> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Reliquary_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Reliquary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017Reliquary.proto\"\206\001\n\tReliquary\022\033\n\023appen" +
      "d_prop_id_list\030\005 \003(\r\022\025\n\rpromote_level\030\003 " +
      "\001(\r\022\r\n\005level\030\001 \001(\r\022\024\n\014main_prop_id\030\004 \001(\r" +
      "\022\013\n\003exp\030\002 \001(\r\022\023\n\013GPPMHJLMIIF\030\006 \001(\010B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Reliquary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Reliquary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Reliquary_descriptor,
        new java.lang.String[] { "AppendPropIdList", "PromoteLevel", "Level", "MainPropId", "Exp", "GPPMHJLMIIF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
